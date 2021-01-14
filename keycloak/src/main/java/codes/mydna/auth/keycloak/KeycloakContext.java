package codes.mydna.auth.keycloak;

import codes.mydna.auth.common.AuthenticationContext;
import codes.mydna.auth.common.enums.Role;
import codes.mydna.auth.common.models.User;
import com.mjamsek.auth.keycloak.context.AuthContext;
import com.mjamsek.auth.keycloak.services.AuthService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

@RequestScoped
public class KeycloakContext extends AuthenticationContext {

    @Inject
    private AuthService authService;

    @Inject
    private HttpServletRequest httpServletRequest;

    public User getUser(){

        String token = httpServletRequest.getHeader("Authorization");

        if(token == null || token.isEmpty())
            return null;

        AuthContext authContext = authService.produceContext(token);

        if(authContext.isAuthenticated()) {
            User user = new User();
            user.setId(authContext.getId());
            user.setUsername(authContext.getUsername());
            user.setEmail(authContext.getEmail());
            user.setRoles(authContext.getRealmRoles()
                    .stream()
                    .filter(s -> Role.getRoleFromName(s) != null)
                    .map(Role::getRoleFromName)
                    .collect(Collectors.toList()));
            return user;
        }

        return null;
    }

}

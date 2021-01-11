package codes.mydna.auth.keycloak;

import codes.mydna.auth.User;
import com.mjamsek.auth.keycloak.context.AuthContext;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class KeycloakContext {

    @Inject
    private AuthContext authContext;

    public User getUser(){

        User user = null;

        if(authContext.isAuthenticated()) {
            user = new User();
            user.setId(authContext.getId());
            user.setUsername(authContext.getUsername());
            user.setEmail(authContext.getEmail());
            user.setRealmRoles(authContext.getRealmRoles());
        }

        return user;
    }

}

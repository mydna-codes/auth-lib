package codes.mydna.auth.common;

import codes.mydna.auth.common.enums.Privilege;
import codes.mydna.auth.common.enums.Role;
import codes.mydna.auth.common.models.User;

import java.util.*;

public class RoleAccess {

    private static final HashMap<Role, HashSet<Privilege>> roleMapping;

    static {
        roleMapping = new HashMap<>();

        roleMapping.put(Role.ADMIN, new HashSet<>(Arrays.asList(
                Privilege.MODIFY_PUBLIC_SEQUENCE,
                Privilege.LARGE_SCALE_ANALYSIS
        )));

        roleMapping.put(Role.PRO_USER, new HashSet<>(Arrays.asList(
                Privilege.LARGE_SCALE_ANALYSIS
        )));

        roleMapping.put(Role.USER, new HashSet<>(Arrays.asList(
        )));
    }

    public static boolean canAccess(Privilege privilege, User user){
        if(user == null)
            return false;
        return user.getRoles().stream().anyMatch(role -> roleMapping.get(role).contains(privilege));
    }

    public static boolean canAccess(Privilege privilege, Role role){
        if(role == null){
            return false;
        }
        return roleMapping.get(role).contains(privilege);
    }

}

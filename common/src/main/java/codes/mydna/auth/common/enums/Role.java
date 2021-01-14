package codes.mydna.auth.common.enums;

import codes.mydna.auth.common.RealmRole;

import java.util.Arrays;

public enum Role {

    GUEST("mdc_guest"),
    ADMIN(RealmRole.ADMIN),
    PRO_USER(RealmRole.PRO_USER),
    USER(RealmRole.USER);

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return name;
    }

    public static Role getRoleFromName(String roleName){
        return Arrays.stream(Role.values())
                .filter(r -> r.getRoleName().equals(roleName))
                .findFirst()
                .orElse(null);
    }

}

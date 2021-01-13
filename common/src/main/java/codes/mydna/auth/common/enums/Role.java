package codes.mydna.auth.common.enums;

public enum Role {

    GUEST("mdc_guest"),
    ADMIN(RealmRole.ADMIN),
    PRO_USER(RealmRole.PRO_USER),
    USER(RealmRole.USER);

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

package codes.mydna.auth.common;

public class Roles {

    public static class GeneralRole {
        public static final String GUEST = "mdc_guest";
    }

    public static class KeycloakRealmRole {
        public static final String ADMIN = "mdc_admin";
        public static final String PRO_USER = "mdc_pro_user";
        public static final String USER = "mdc_user";
    }

}

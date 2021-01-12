package codes.mydna.auth.common;

public class Roles {

    static class GeneralRole {
        static final String GUEST = "mdc_guest";
    }

    static class KeycloakRealmRole {
        public static final String ADMIN = "mdc_admin";
        public static final String PRO_USER = "mdc_pro_user";
        public static final String USER = "mdc_user";
    }

}

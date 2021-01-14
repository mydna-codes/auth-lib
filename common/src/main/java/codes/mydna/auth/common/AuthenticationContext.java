package codes.mydna.auth.common;

import codes.mydna.auth.common.models.User;

public abstract class AuthenticationContext {

    public abstract User getUser();

}

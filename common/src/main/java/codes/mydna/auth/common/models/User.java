package codes.mydna.auth.common.models;

import codes.mydna.auth.common.enums.Role;

import java.util.List;

public class User {

    private String id;
    private String username;
    private String email;
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles){
        this.roles = roles;
    }

}

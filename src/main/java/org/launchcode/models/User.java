package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message="Please enter a username longer than 5 characters but shorter than 15.")
    @Size(min=5, max=15)
    private String username;
    @Email(message="Must be an email format.")
    private String email;
    @NotBlank(message="Please enter a password longer than 6 characters.")
    @Size(min=6)
    private String password;

    @NotBlank(message="Please enter a password longer than 6 characters.")
    private String verify;

    public User() {

    }
@NotBlank
@Size(min=5, max=15)


    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}


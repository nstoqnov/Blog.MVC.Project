package blog.forms;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterForm {
    @Size(min = 2, max = 20, message = "Please insert username between 2 and 20 symbols.")
    @NotNull
    private String username;
    @Size(min =2, max = 20, message = "Please insert password between 2 nad 20 symbols.")
    @NotNull
    private String password;
    @Size(min =2, max = 20, message = "Please insert your fullname.")
    private String fullname;
    @NotNull
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

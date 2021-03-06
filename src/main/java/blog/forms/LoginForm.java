package blog.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @Size(min= 2, max = 20, message = "Please insert username between 2 and 20 symbols.")
    private String username;
    @Size(min =2, max = 20, message = "Please insert password between 2 nad 20 symbols.")
    @NotNull
    private String password;

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
}

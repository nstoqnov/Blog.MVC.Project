package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
    @RequestMapping("/users/login")
    public String showLoginForm(){
        return "users/login";
    }
}

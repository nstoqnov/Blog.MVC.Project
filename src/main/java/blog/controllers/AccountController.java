package blog.controllers;

import blog.forms.LoginForm;
import blog.forms.RegisterForm;
import blog.services.NotificationService;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.expression.Objects;
import java.lang.Object.*;
import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class AccountController {

    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/users/login")
    public String showLoginForm(LoginForm loginForm){
        return "users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage("Please fill the form correctly!");
            return "users/login";
        }

        if (!userService.authenticate(
                loginForm.getUsername(), loginForm.getPassword())) {
            notificationService.addErrorMessage("Invalid login!");
            return "users/login";
        }

        notificationService.addInfoMessage("Login successful");
        return "redirect:/";

    }

    @RequestMapping("/users/register")
    public String showRegisterForm(RegisterForm registerForm){
        return "users/register";
    }

    @RequestMapping(value = "/users/register", method = RequestMethod.POST)
    public String RegisterPage(@Valid RegisterForm registerForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage("Please fill the register form correctly!");
            return "users/register";
        }

        if (!userService.authenticate(
                registerForm.getUsername(), registerForm.getPassword())) {
            notificationService.addErrorMessage("Invalid login!");
            return "users/register";
        }

        notificationService.addInfoMessage("Register successful");
        return "redirect:/";

    }
}

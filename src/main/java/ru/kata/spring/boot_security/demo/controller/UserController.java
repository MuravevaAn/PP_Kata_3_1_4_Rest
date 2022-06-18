package ru.kata.spring.boot_security.demo.controller;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/userPage")
    public String showUser(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "userPanel";
    }

    @GetMapping("/index")
    public String index(Model model) {
        User thisUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("thisUser", thisUser);
        return "index";
    }
}

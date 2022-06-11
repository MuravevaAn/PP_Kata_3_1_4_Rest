package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;


@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUser(Model model) {
        model.addAttribute("user", userService.getAllUsers());
        return "showUser";
    }

//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @GetMapping
//    public String index(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "index";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") long id, Model model) {
//        model.addAttribute("user", userService.show(id));
//        return "/show";
//    }
//
//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "new_user";
//    }
//
//    @PostMapping
//    public String creat(@ModelAttribute("user") User user) {
//        userService.addUser(user);
//        return "redirect:/";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") long id) {
//        model.addAttribute("user", userService.show(id));
//        return "/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") long id ) {
//        userService.updateUser(user, id);
//        return "redirect:/";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") long id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
}

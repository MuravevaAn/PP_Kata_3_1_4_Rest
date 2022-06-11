package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();
    User show(long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user, long id);

}

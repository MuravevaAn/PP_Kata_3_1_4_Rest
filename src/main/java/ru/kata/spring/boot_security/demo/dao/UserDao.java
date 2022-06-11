package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserDao {
    List<User> getAllUsers();
    User show(long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user, long id);
    User findByUsername(String email);
}

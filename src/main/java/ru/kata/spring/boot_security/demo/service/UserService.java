package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUser();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(int id);
    public User findByUsername(String username);
}

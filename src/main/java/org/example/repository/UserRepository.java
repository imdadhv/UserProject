package org.example.repository;

import org.example.domain.entity.User;

import java.util.List;

public interface UserRepository {
    boolean saveUser(User user);
    User findUserById(Long id);
    User findUserByPin(String pin);
    List<User> getAllUsers();
    boolean deleteById(Long id);
    boolean deleteByUserPin(String pin);
}

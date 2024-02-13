package org.example.repository.impl;

import org.example.domain.entity.User;
import org.example.repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public boolean saveUser(User user) {
        return false;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User findUserByPin(String pin) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean deleteByUserPin(String pin) {
        return false;
    }
}

package org.example.service;

import org.example.domain.entity.User;
import org.example.dto.request.UserCreateDto;
import org.example.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto saveUser(UserCreateDto userCreateDto);
    UserResponseDto findUserById(Long id);
    UserResponseDto findUserByPin(String pin);
    List<UserResponseDto> getAllUsers();
    boolean deleteById(Long id);
    boolean deleteByUserPin(String pin);
}

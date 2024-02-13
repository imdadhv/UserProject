package org.example.service.impl;

import org.example.domain.entity.User;
import org.example.dto.request.UserCreateDto;
import org.example.dto.response.UserResponseDto;
import org.example.mapper.UserMapper;
import org.example.repository.UserRepository;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.UserService;
import org.example.util.FileWriterReaderUtil;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository UserRepository = new UserRepositoryImpl();
    private final UserMapper userMapper = new UserMapper();

    @Override
    public UserResponseDto saveUser(UserCreateDto userCreateDto) {
        User user = userMapper.toUser(userCreateDto);
        FileWriterReaderUtil.writeObject(user);
        return null;
    }

    @Override
    public UserResponseDto findUserById(Long id) {
        return null;
    }

    @Override
    public UserResponseDto findUserByPin(String pin) {
        return null;
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
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

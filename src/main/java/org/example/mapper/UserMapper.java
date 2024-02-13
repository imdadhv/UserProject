package org.example.mapper;

import org.example.domain.entity.User;
import org.example.dto.request.UserCreateDto;
import org.example.dto.response.UserResponseDto;
import org.example.util.EncoderUtil;

public class UserMapper {
    public User toUser(UserCreateDto request) {
        User user = new User();
        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setEmail(request.getEmail());
        user.setAge(request.getAge());
        user.setPin(request.getPin());
        user.setPassword(EncoderUtil.encode(request.getPassword()));
        return user;

    }
    public UserResponseDto toResponseDto(User user) {
        UserResponseDto response = new UserResponseDto();
        response.setName(user.getName());
        response.setSurname(user.getSurname());
        response.setAge(user.getAge());
        response.setEmail(user.getEmail());
        return response;
    }
}

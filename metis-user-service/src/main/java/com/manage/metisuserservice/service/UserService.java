package com.manage.metisuserservice.service;

import com.manage.metisuserservice.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto dto);

    UserDto getUserById(Long id);

    UserDto getUserByUsername(String username);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long id, UserDto userDto);

}

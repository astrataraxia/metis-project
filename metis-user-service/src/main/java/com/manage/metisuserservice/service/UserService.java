package com.manage.metisuserservice.service;

import com.manage.metisuserservice.dto.PasswordChangeRequestDto;
import com.manage.metisuserservice.dto.UserRequestDto;
import com.manage.metisuserservice.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserRequestDto dto);

    UserResponseDto getUserById(Long id);

    UserResponseDto getUserByUsername(String username);

    UserResponseDto getUserByEmail(String email);

    List<UserResponseDto> getAllUsers();

    void changePassword(Long id, PasswordChangeRequestDto dto);

}

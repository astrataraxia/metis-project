package com.manage.metisuserservice.service;

import com.manage.metisuserservice.dto.UserDto;
import com.manage.metisuserservice.model.User;
import com.manage.metisuserservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public UserDto createUser(UserDto dto) {
        return null;
    }

    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    @Override
    public UserDto getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        return null;
    }
}

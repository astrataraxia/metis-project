package com.manage.metisuserservice.service;

import com.manage.metisuserservice.dto.PasswordChangeRequestDto;
import com.manage.metisuserservice.dto.UserRequestDto;
import com.manage.metisuserservice.dto.UserResponseDto;
import com.manage.metisuserservice.model.User;
import com.manage.metisuserservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        User save = userRepository.save(User.builder()
                .username(dto.username())
                .email(dto.email())
                .password(dto.password())
                .build());
        return UserResponseDto.responseUser(save);
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
        return UserResponseDto.responseUser(user);
    }

    @Override
    public UserResponseDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + email));
        return UserResponseDto.responseUser(user);
    }

    @Override
    public UserResponseDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException("User not found with username: " + username));
        return UserResponseDto.responseUser(user);
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserResponseDto::responseUser)
                .toList();
    }

    @Override
    @Transactional
    public void changePassword(Long id, PasswordChangeRequestDto dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
        // TODO - password Encoder 도입 후 Code 수정 예정
        // password encoder match -> curPsw == userPsw => not match exception
        // match -> valid -> change psw
        user.changePassword(dto.newPsw());
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).*$");
    }
}

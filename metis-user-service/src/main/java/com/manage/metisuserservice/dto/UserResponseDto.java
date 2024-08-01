package com.manage.metisuserservice.dto;

import com.manage.metisuserservice.model.User;

import java.time.LocalDateTime;

public record UserResponseDto(Long id,
                              String username,
                              String email,
                              LocalDateTime createdAt,
                              LocalDateTime updatedAt) {

    public static UserResponseDto responseUser(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getUpdatedAt());
    }
}

package com.manage.metisuserservice.controller;

import com.manage.metisuserservice.dto.PasswordChangeRequestDto;
import com.manage.metisuserservice.dto.UserRequestDto;
import com.manage.metisuserservice.dto.UserResponseDto;
import com.manage.metisuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/metis-user-service/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto) {
        log.info("create user");
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.createUser(userRequestDto));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable("id") Long id) {
        log.info("get user by id");
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserResponseDto> getUserByEmail(@PathVariable("email") String email) {
        log.info("get user by email");
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<UserResponseDto> getUserByName(@PathVariable("username") String username) {
        log.info("get user by name");
        return ResponseEntity.ok(userService.getUserByUsername(username));
    }

    @PatchMapping("/{id}/password")
    public ResponseEntity<Void> changePassword(@PathVariable("id") Long id,
                                               @RequestBody PasswordChangeRequestDto dto) {
        userService.changePassword(id,dto);
        return ResponseEntity.noContent().build();
    }
}

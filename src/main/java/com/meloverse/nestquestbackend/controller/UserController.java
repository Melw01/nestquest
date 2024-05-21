package com.meloverse.nestquestbackend.controller;

import com.meloverse.nestquestbackend.dto.UserDto;
import com.meloverse.nestquestbackend.exception.ResourceNotFoundException;
import com.meloverse.nestquestbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
        UserDto userDto = userService.getById(id);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAll() {
        List<UserDto> userDtos = userService.getAll();
        return ResponseEntity.ok(userDtos);
    }



}

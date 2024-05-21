package com.meloverse.nestquestbackend.service;

import com.meloverse.nestquestbackend.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getById(Long id);

    List<UserDto> getAll();

}

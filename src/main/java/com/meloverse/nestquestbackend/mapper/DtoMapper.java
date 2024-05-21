package com.meloverse.nestquestbackend.mapper;

import com.meloverse.nestquestbackend.dto.UserDto;
import com.meloverse.nestquestbackend.entity.User;

public class DtoMapper {
    public static UserDto mapToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber()
        );
    }

    public static User mapFromDto(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPhoneNumber()
        );
    }
}

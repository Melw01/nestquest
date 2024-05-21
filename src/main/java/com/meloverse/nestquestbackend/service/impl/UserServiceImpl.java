package com.meloverse.nestquestbackend.service.impl;

import com.meloverse.nestquestbackend.dto.UserDto;
import com.meloverse.nestquestbackend.entity.User;
import com.meloverse.nestquestbackend.exception.ResourceNotFoundException;
import com.meloverse.nestquestbackend.mapper.DtoMapper;
import com.meloverse.nestquestbackend.repository.UserRepository;
import com.meloverse.nestquestbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = DtoMapper.mapFromDto(userDto);
        User savedUser = repository.save(user);
        return DtoMapper.mapToDto(savedUser);
    }

    @Override
    public UserDto getById(Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("User id %d does not exist", id)));
        return DtoMapper.mapToDto(user);
    }

    @Override
    public List<UserDto> getAll() {
        List<User> users = repository.findAll();
        return users.stream().map(DtoMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long id, UserDto updatedUser) {
        User user = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("User id %d does not exist", id)));

        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setPhoneNumber(updatedUser.getPhoneNumber());

        User updatedUserObj = repository.save(user);
        return DtoMapper.mapToDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("User id %d does not exist", id)));
        repository.deleteById(id);

    }
}

package com.meloverse.nestquestbackend.service.impl;

import com.meloverse.nestquestbackend.dto.ClientDto;
import com.meloverse.nestquestbackend.entity.Client;
import com.meloverse.nestquestbackend.exception.ResourceNotFoundException;
import com.meloverse.nestquestbackend.mapper.DtoMapper;
import com.meloverse.nestquestbackend.repository.ClientRepository;
import com.meloverse.nestquestbackend.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private ClientRepository repository;

    @Override
    public ClientDto create(ClientDto clientDto) {
        Client client = DtoMapper.mapFromDto(clientDto);
        Client savedClient = repository.save(client);
        return DtoMapper.mapToDto(savedClient);
    }

    @Override
    public ClientDto getById(Long id) {
        Client client = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Client id %d does not exist", id)));
        return DtoMapper.mapToDto(client);
    }

    @Override
    public List<ClientDto> getAll() {
        List<Client> clients = repository.findAll();
        return clients.stream().map(DtoMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public ClientDto update(Long id, ClientDto updatedClient) {
        Client client = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Client id %d does not exist", id)));

        client.setFirstName(updatedClient.getFirstName());
        client.setLastName(updatedClient.getLastName());
        client.setEmail(updatedClient.getEmail());
        client.setPhoneNumber(updatedClient.getPhoneNumber());

        Client updatedClientObj = repository.save(client);
        return DtoMapper.mapToDto(updatedClientObj);
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Client id %d does not exist", id)));
        repository.deleteById(id);

    }
}

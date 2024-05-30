package com.meloverse.nestquestbackend.service;

import com.meloverse.nestquestbackend.dto.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto create(ClientDto clientDto);

    ClientDto getById(Long id);

    List<ClientDto> getAll();

    ClientDto update(Long id, ClientDto updatedClient);

    void delete(Long id);
}

package com.meloverse.nestquestbackend.controller;

import com.meloverse.nestquestbackend.dto.ClientDto;
import com.meloverse.nestquestbackend.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {

    private ClientService clientService;

    @GetMapping("{id}")
    public ResponseEntity<ClientDto> getById(@PathVariable("id") Long id) {
        ClientDto clientDto = clientService.getById(id);
        return ResponseEntity.ok(clientDto);
    }

    @PostMapping
    public ResponseEntity<ClientDto> create(@RequestBody ClientDto clientDto) {
        return new ResponseEntity<>(clientService.create(clientDto), CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClientDto>> getAll() {
        List<ClientDto> clientDtos = clientService.getAll();
        return ResponseEntity.ok(clientDtos);
    }

    @PutMapping("{id}")
    public ResponseEntity<ClientDto> update(@PathVariable("id") Long id, @RequestBody ClientDto updatedClientDto) {
        ClientDto clientDto = clientService.update(id, updatedClientDto);
        return ResponseEntity.ok(clientDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        clientService.delete(id);
        return ResponseEntity.ok(String.format("Client id %d deleted successfully", id));
    }
}


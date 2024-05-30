package com.meloverse.nestquestbackend.controller;

import com.meloverse.nestquestbackend.dto.PropertyDto;
import com.meloverse.nestquestbackend.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/property")
@AllArgsConstructor
public class PropertyController {

    private PropertyService propertyService;

    @GetMapping("{id}")
    public ResponseEntity<PropertyDto> getById(@PathVariable("id") Long id) {
        PropertyDto propertyDto = propertyService.getById(id);
        return ResponseEntity.ok(propertyDto);
    }

    @PostMapping
    public ResponseEntity<PropertyDto> create(@RequestBody PropertyDto propertyDto) {
        PropertyDto savedProperty = propertyService.create(propertyDto);
        return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PropertyDto>> getAll() {
        List<PropertyDto> propertyDtos = propertyService.getAll();
        return ResponseEntity.ok(propertyDtos);
    }

    @PutMapping("{id}")
    public ResponseEntity<PropertyDto> update(@PathVariable("id") Long id,
                                              @RequestBody PropertyDto updatedPropertyDto) {
        PropertyDto propertyDto = propertyService.update(id, updatedPropertyDto);
        return ResponseEntity.ok(propertyDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        propertyService.delete(id);
        return ResponseEntity.ok(String.format("Property id %d deleted successfully", id));
    }
}


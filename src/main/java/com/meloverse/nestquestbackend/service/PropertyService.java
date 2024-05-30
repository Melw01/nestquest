package com.meloverse.nestquestbackend.service;

import com.meloverse.nestquestbackend.dto.PropertyDto;
import java.util.List;

public interface PropertyService {
    PropertyDto create(PropertyDto propertyDto);

    PropertyDto getById(Long id);

    List<PropertyDto> getAll();

    PropertyDto update(Long id, PropertyDto updatedProperty);

    void delete(Long id);
}

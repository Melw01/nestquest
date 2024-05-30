package com.meloverse.nestquestbackend.service.impl;

import com.meloverse.nestquestbackend.dto.PropertyDto;
import com.meloverse.nestquestbackend.entity.Property;
import com.meloverse.nestquestbackend.entity.User;
import com.meloverse.nestquestbackend.exception.ResourceNotFoundException;
import com.meloverse.nestquestbackend.mapper.DtoMapper;
import com.meloverse.nestquestbackend.repository.PropertyRepository;
import com.meloverse.nestquestbackend.repository.UserRepository;
import com.meloverse.nestquestbackend.service.PropertyService;
import com.meloverse.nestquestbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepository repository;

    @Override
    public PropertyDto create(PropertyDto propertyDto) {
        Property property = DtoMapper.mapFromDto(propertyDto);
        Property savedProperty = repository.save(property);
        return DtoMapper.mapToDto(savedProperty);
    }

    @Override
    public PropertyDto getById(Long id) {
        Property property = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Property id %d does not exist", id)));
        return DtoMapper.mapToDto(property);
    }

    @Override
    public List<PropertyDto> getAll() {
        List<Property> properties = repository.findAll();
        return properties.stream().map(DtoMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public PropertyDto update(Long id, PropertyDto updatedProperty) {
        Property property = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Property id %d does not exist", id)));

        property.setId(updatedProperty.getId());
        property.setAddress(updatedProperty.getAddress());
        property.setCity(updatedProperty.getCity());
        property.setState(updatedProperty.getState());
        property.setZipCode(updatedProperty.getZipCode());
        property.setPurchasePrice(updatedProperty.getPurchasePrice());
        property.setPropertyType(updatedProperty.getPropertyType());
        property.setSquareFootage(updatedProperty.getSquareFootage());
        property.setBedrooms(updatedProperty.getBedrooms());
        property.setBathrooms(updatedProperty.getBathrooms());
        property.setYearBuilt(updatedProperty.getYearBuilt());
        property.setInvestments(updatedProperty.getInvestments());
        property.setRentalIncomes(updatedProperty.getRentalIncomes());
        property.setExpenses(updatedProperty.getExpenses());
        property.setSaleInformationList(updatedProperty.getSaleInformationList());
        property.setFinancialMetrics(updatedProperty.getFinancialMetrics());
        return DtoMapper.mapToDto(repository.save(property));
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("Property id %d does not exist", id)));
        repository.deleteById(id);

    }
}

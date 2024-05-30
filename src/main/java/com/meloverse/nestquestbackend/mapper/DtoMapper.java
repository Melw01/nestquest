package com.meloverse.nestquestbackend.mapper;

import com.meloverse.nestquestbackend.dto.ClientDto;
import com.meloverse.nestquestbackend.dto.PropertyDto;
import com.meloverse.nestquestbackend.entity.Client;
import com.meloverse.nestquestbackend.entity.Property;

public class DtoMapper {
    public static ClientDto mapToDto(Client client) {
        if (client == null) {
            return null;
        }
        return new ClientDto(
                client.getId(),
                client.getFirstName(),
                client.getLastName(),
                client.getEmail(),
                client.getPhoneNumber(),
                client.getUsername(),
                client.getPassword(),
                null
        );
    }

    public static Client mapFromDto(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
        }
        return new Client(
                clientDto.getId(),
                clientDto.getFirstName(),
                clientDto.getLastName(),
                clientDto.getEmail(),
                clientDto.getPhoneNumber(),
                clientDto.getUsername(),
                clientDto.getPassword()
        );
    }

    public static Property mapFromDto(PropertyDto propertyDto) {
        if (propertyDto == null) {
            return null;
        }
        Property property = new Property();
        property.setId(propertyDto.getId());
        property.setAddress(propertyDto.getAddress());
        property.setCity(propertyDto.getCity());
        property.setState(propertyDto.getState());
        property.setZipCode(propertyDto.getZipCode());
        property.setPurchasePrice(propertyDto.getPurchasePrice());
        property.setPropertyType(propertyDto.getPropertyType());
        property.setSquareFootage(propertyDto.getSquareFootage());
        property.setBedrooms(propertyDto.getBedrooms());
        property.setBathrooms(propertyDto.getBathrooms());
        property.setYearBuilt(propertyDto.getYearBuilt());
        return property;
    }

    public static PropertyDto mapToDto(Property property) {
        if (property == null) {
            return null;
        }
        PropertyDto propertyDto = new PropertyDto();
        propertyDto.setId(property.getId());
        propertyDto.setAddress(property.getAddress());
        propertyDto.setCity(property.getCity());
        propertyDto.setState(property.getState());
        propertyDto.setZipCode(property.getZipCode());
        propertyDto.setPurchasePrice(property.getPurchasePrice());
        propertyDto.setPropertyType(property.getPropertyType());
        propertyDto.setSquareFootage(property.getSquareFootage());
        propertyDto.setBedrooms(property.getBedrooms());
        propertyDto.setBathrooms(property.getBathrooms());
        propertyDto.setYearBuilt(property.getYearBuilt());
        return propertyDto;
    }
}

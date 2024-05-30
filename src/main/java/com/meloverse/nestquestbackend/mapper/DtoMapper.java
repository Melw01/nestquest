package com.meloverse.nestquestbackend.mapper;

import com.meloverse.nestquestbackend.dto.PropertyDto;
import com.meloverse.nestquestbackend.dto.UserDto;
import com.meloverse.nestquestbackend.entity.Property;
import com.meloverse.nestquestbackend.entity.User;

public class DtoMapper {
    public static UserDto mapToDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getUsername(),
                user.getPassword(),
                user.getProperties()
        );
    }

    public static User mapFromDto(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPhoneNumber(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getProperties()
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
        property.setInvestments(propertyDto.getInvestments());
        property.setRentalIncomes(propertyDto.getRentalIncomes());
        property.setExpenses(propertyDto.getExpenses());
        property.setSaleInformationList(propertyDto.getSaleInformationList());
        property.setFinancialMetrics(propertyDto.getFinancialMetrics());
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
        propertyDto.setInvestments(property.getInvestments());
        propertyDto.setRentalIncomes(property.getRentalIncomes());
        propertyDto.setExpenses(property.getExpenses());
        propertyDto.setSaleInformationList(property.getSaleInformationList());
        propertyDto.setFinancialMetrics(property.getFinancialMetrics());
        return propertyDto;
    }
}

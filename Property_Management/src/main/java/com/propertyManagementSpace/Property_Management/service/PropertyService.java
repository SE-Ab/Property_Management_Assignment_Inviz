package com.propertyManagementSpace.Property_Management.service;

import com.propertyManagementSpace.Property_Management.domain.Property;

import java.util.List;
import java.util.Optional;

public interface PropertyService {
    Property createProperty(Property property);

    List<Property> getProperties();

    List<Property> getPropertiesByCity(String city);

    Optional<Property> getPropertyById(String id);

    Property updateProperty(Property property);

    List<String> getCitiesByState(String state);
}

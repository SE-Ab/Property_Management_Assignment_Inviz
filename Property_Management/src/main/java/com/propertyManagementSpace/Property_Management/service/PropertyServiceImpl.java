package com.propertyManagementSpace.Property_Management.service;

import com.propertyManagementSpace.Property_Management.domain.Property;
import com.propertyManagementSpace.Property_Management.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }
    @Override
    public List<Property> getProperties() {
        return propertyRepository.findAll();
    }
    @Override
    public List<Property> getPropertiesByCity(String city) {
        return propertyRepository.findByCity(city);
    }
    @Override
    public Optional<Property> getPropertyById(String id) {
        return propertyRepository.findById(id);
    }
    @Override
    public Property updateProperty(Property property) {
        return propertyRepository.save(property);
    }
    @Override
    public List<String> getCitiesByState(String state) {
        List<Property> properties = propertyRepository.findByState(state);
        return properties.stream().map(Property::getCity).distinct().toList();
    }
}

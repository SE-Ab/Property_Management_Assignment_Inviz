package com.propertyManagementSpace.Property_Management.controller;

import com.propertyManagementSpace.Property_Management.domain.Property;
import com.propertyManagementSpace.Property_Management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping("/")
    public List<Property> createNewProperty(@RequestBody Property property) {
        propertyService.createProperty(property);
        return propertyService.getProperties();
    }

    @GetMapping("/city/{city}")
    public List<Property> fetchPropertyDetails(@PathVariable String city) {
        return propertyService.getPropertiesByCity(city);
    }

    @PutMapping("/")
    public List<Property> updatePropertyDetails(@RequestBody Property property) {
        propertyService.updateProperty(property);
        return propertyService.getProperties();
    }

    @GetMapping("/state/{state}")
    public List<String> findCitiesByState(@PathVariable String state) {
        return propertyService.getCitiesByState(state);
    }

    @GetMapping("/getOne/{id}")
    public Optional<Property> findOneProperties(@PathVariable String id) {
        return propertyService.getPropertyById(id);
    }
}

package com.propertyManagementSpace.Property_Management.repository;

import com.propertyManagementSpace.Property_Management.domain.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends MongoRepository<Property, String> {
    List<Property> findByCity(String city);
    List<Property> findByState(String state);
}

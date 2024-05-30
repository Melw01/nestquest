package com.meloverse.nestquestbackend.repository;

import com.meloverse.nestquestbackend.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}

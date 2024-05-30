package com.meloverse.nestquestbackend.repository;

import com.meloverse.nestquestbackend.entity.Property;
import com.meloverse.nestquestbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}

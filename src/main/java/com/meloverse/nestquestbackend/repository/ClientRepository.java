package com.meloverse.nestquestbackend.repository;

import com.meloverse.nestquestbackend.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

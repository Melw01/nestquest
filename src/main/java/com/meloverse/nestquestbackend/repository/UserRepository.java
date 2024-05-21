package com.meloverse.nestquestbackend.repository;

import com.meloverse.nestquestbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository  extends JpaRepository<User, Long> {
}

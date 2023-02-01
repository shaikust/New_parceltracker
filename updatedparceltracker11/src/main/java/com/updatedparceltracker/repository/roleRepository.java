package com.updatedparceltracker.repository;

import com.updatedparceltracker.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface roleRepository extends JpaRepository<Roles,Integer> {
    Optional<Roles> findByName(String name);
}

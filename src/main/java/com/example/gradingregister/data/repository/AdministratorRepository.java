package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    List<Administrator> findAllByName(String name);
}

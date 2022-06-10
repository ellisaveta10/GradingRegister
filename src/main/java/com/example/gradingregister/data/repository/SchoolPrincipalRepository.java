package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.SchoolPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolPrincipalRepository extends JpaRepository<SchoolPrincipal, Long> {
    List<SchoolPrincipal> findAllByName(String name);
}

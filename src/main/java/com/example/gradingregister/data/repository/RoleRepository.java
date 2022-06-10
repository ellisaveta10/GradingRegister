package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByName(String name);
}

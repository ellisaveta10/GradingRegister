package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByUsername(String name);
}

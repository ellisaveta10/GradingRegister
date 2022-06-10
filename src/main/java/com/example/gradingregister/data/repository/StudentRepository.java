package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByName(String name);
}

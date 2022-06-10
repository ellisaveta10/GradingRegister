package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    List<Subject> findAllByName(String name);
}

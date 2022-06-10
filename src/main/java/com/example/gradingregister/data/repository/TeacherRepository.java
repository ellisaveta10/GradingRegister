package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAllByName(String name);
}

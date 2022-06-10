package com.example.gradingregister.data.repository;

import com.example.gradingregister.data.entity.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {
}

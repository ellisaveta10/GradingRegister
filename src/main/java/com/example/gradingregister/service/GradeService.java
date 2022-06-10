package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Grade;

import java.util.List;

public interface GradeService {
    List<GradeDTO> getGrades();

    GradeDTO getGrade(long id);

    Grade createGrade(CreateGradeDTO createGradeDTO);

    Grade updateGrade(long id, UpdateGradeDTO updateGradeDTO);

    void deleteGrade(long id);

    List<Grade>findAllByName(String name);
}

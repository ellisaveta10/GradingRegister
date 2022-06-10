package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Curriculum;

import java.util.List;

public interface CurriculumService {
    List<CurriculumDTO> getCurriculums();

    CurriculumDTO getCurriculums(long id);

    Curriculum createCurriculum(CreateCurriculumDTO createCurriculumDTO);

    Curriculum updateCurriculum(long id, UpdateCurriculumDTO updateCurriculumDTO);

    void deleteCurriculum(long id);

    //List<Curriculum>findAllByName(String name);
}

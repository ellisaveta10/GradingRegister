package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<SubjectDTO> getSubjects();

    SubjectDTO getSubject(long id);

    Subject createSubject(CreateSubjectDTO createSubjectDTO);

    Subject updateSubject(long id, UpdateSubjectDTO updateSubjectDTO);

    void deleteSubject(long id);

    List<Subject>findAllByName(String name);
}

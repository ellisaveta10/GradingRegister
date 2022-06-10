package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Subject;
import com.example.gradingregister.data.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<TeacherDTO> getTeachers();

    TeacherDTO getTeacher(long id);

    Teacher createTeacher(CreateTeacherDTO createTeacherDTO);

    Teacher updateTeacher(long id, UpdateTeacherDTO updateTeacherDTO);

    void deleteTeacher(long id);

    List<Teacher>findAllByName(String name);
}

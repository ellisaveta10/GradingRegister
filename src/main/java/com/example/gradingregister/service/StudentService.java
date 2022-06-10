package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getStudents();

    StudentDTO getStudent(long id);

    Student createStudent(CreateStudentDTO createStudentDTO);

    Student updateStudent(long id, UpdateStudentDTO updateStudentDTO);

    void deleteStudent(long id);

    List<Student>findAllByName(String name);
}

package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateStudentDTO;
import com.example.gradingregister.data.dto.StudentDTO;
import com.example.gradingregister.data.dto.UpdateStudentDTO;
import com.example.gradingregister.data.entity.Student;
import com.example.gradingregister.data.repository.StudentRepository;
import com.example.gradingregister.service.StudentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<StudentDTO> getStudents() {
        return studentRepository.findAll().stream()
                .map(this::convertToStudentDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudent(long id) {
        return modelMapper.map(studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Student ID: " + id)), StudentDTO.class);
    }

    @Override
    public Student createStudent(CreateStudentDTO createStudentDTO) {
        return studentRepository.save(modelMapper.map(createStudentDTO, Student.class));
    }

    @Override
    public Student updateStudent(long id, UpdateStudentDTO updateStudentDTO) {
        Student student = modelMapper.map(updateStudentDTO, Student.class);
        student.setId(id);
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllByName(String name) {
        return studentRepository.findAllByName(name);
    }

    private StudentDTO convertToStudentDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }
}

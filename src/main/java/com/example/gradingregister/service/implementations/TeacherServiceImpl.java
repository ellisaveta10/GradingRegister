package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateTeacherDTO;
import com.example.gradingregister.data.dto.TeacherDTO;
import com.example.gradingregister.data.dto.UpdateTeacherDTO;
import com.example.gradingregister.data.entity.Teacher;
import com.example.gradingregister.data.repository.TeacherRepository;
import com.example.gradingregister.service.TeacherService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<TeacherDTO> getTeachers() {
        return teacherRepository.findAll().stream()
                .map(this::convertToTeacherDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherDTO getTeacher(long id) {
        return modelMapper.map(teacherRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Teacher ID: " + id)), TeacherDTO.class);
    }

    @Override
    public Teacher createTeacher(CreateTeacherDTO createTeacherDTO) {
        return teacherRepository.save(modelMapper.map(createTeacherDTO, Teacher.class));
    }

    @Override
    public Teacher updateTeacher(long id, UpdateTeacherDTO updateTeacherDTO) {
        Teacher teacher = modelMapper.map(updateTeacherDTO, Teacher.class);
        teacher.setId(id);
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public List<Teacher> findAllByName(String name) {
        return teacherRepository.findAllByName(name);
    }

    private TeacherDTO convertToTeacherDTO(Teacher teacher) {
        return modelMapper.map(teacher, TeacherDTO.class);
    }
}

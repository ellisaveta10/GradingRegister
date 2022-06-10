package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateSubjectDTO;
import com.example.gradingregister.data.dto.SubjectDTO;
import com.example.gradingregister.data.dto.UpdateSubjectDTO;
import com.example.gradingregister.data.entity.Subject;
import com.example.gradingregister.data.repository.SubjectRepository;
import com.example.gradingregister.service.SubjectService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<SubjectDTO> getSubjects() {
        return subjectRepository.findAll().stream()
                .map(this::convertToSubjectDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SubjectDTO getSubject(long id) {
        return modelMapper.map(subjectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Subject ID: " + id)), SubjectDTO.class);
    }

    @Override
    public Subject createSubject(CreateSubjectDTO createSubjectDTO) {
        return subjectRepository.save(modelMapper.map(createSubjectDTO, Subject.class));
    }

    @Override
    public Subject updateSubject(long id, UpdateSubjectDTO updateSubjectDTO) {
        Subject subject = modelMapper.map(updateSubjectDTO, Subject.class);
        subject.setId(id);
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public List<Subject> findAllByName(String name) {
        return subjectRepository.findAllByName(name);
    }

    private SubjectDTO convertToSubjectDTO(Subject subject) {
        return modelMapper.map(subject, SubjectDTO.class);
    }
}

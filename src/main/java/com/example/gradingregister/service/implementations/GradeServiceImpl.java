package com.example.gradingregister.service.implementations;
;
import com.example.gradingregister.data.dto.CreateGradeDTO;
import com.example.gradingregister.data.dto.GradeDTO;
import com.example.gradingregister.data.dto.UpdateGradeDTO;
import com.example.gradingregister.data.entity.Grade;
import com.example.gradingregister.data.repository.GradeRepository;
import com.example.gradingregister.service.GradeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<GradeDTO> getGrades() {
        return gradeRepository.findAll().stream()
                .map(this::convertToGradeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GradeDTO getGrade(long id) {
        return modelMapper.map(gradeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Grade ID: " + id)), GradeDTO.class);
    }

    @Override
    public Grade createGrade(CreateGradeDTO createGradeDTO) {
        return gradeRepository.save(modelMapper.map(createGradeDTO, Grade.class));
    }

    @Override
    public Grade updateGrade(long id, UpdateGradeDTO updateGradeDTO) {
        Grade grade = modelMapper.map(updateGradeDTO, Grade.class);
        grade.setId(id);
        return gradeRepository.save(grade);
    }

    @Override
    public void deleteGrade(long id) {
        gradeRepository.deleteById(id);
    }

    @Override
    public List<Grade> findAllByName(String name) {
        return gradeRepository.findAllByName(name);
    }

    private GradeDTO convertToGradeDTO(Grade grade) {
        return modelMapper.map(grade, GradeDTO.class);
    }
}

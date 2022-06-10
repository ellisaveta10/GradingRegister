package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateCurriculumDTO;
import com.example.gradingregister.data.dto.CurriculumDTO;
import com.example.gradingregister.data.dto.UpdateCurriculumDTO;
import com.example.gradingregister.data.entity.Curriculum;
import com.example.gradingregister.data.repository.CurriculumRepository;
import com.example.gradingregister.service.CurriculumService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CurriculumServiceImpl implements CurriculumService {

    private final CurriculumRepository curriculumRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CurriculumDTO> getCurriculums() {
        return curriculumRepository.findAll().stream()
                .map(this::convertToCurriculumDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CurriculumDTO getCurriculums(long id) {
        return modelMapper.map(curriculumRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Curriculum ID: " + id)), CurriculumDTO.class);
    }

    @Override
    public Curriculum createCurriculum(CreateCurriculumDTO createCurriculumDTO) {
        return curriculumRepository.save(modelMapper.map(createCurriculumDTO, Curriculum.class));
    }

    @Override
    public Curriculum updateCurriculum(long id, UpdateCurriculumDTO updateCurriculumDTO) {
        Curriculum curriculum = modelMapper.map(updateCurriculumDTO, Curriculum.class);
        curriculum.setId(id);
        return curriculumRepository.save(curriculum);
    }

    @Override
    public void deleteCurriculum(long id) {
        curriculumRepository.deleteById(id);
    }

    private CurriculumDTO convertToCurriculumDTO(Curriculum curriculum) {
        return modelMapper.map(curriculum, CurriculumDTO.class);
    }
}

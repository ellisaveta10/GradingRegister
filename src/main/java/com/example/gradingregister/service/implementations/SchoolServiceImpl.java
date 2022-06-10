package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateSchoolDTO;
import com.example.gradingregister.data.dto.SchoolDTO;
import com.example.gradingregister.data.dto.UpdateSchoolDTO;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.repository.SchoolRepository;
import com.example.gradingregister.service.SchoolService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SchoolServiceImpl implements SchoolService {
    private final SchoolRepository schoolRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<SchoolDTO> getSchools() {
        return schoolRepository.findAll().stream()
                .map(this::convertToSchoolDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SchoolDTO getSchool(long id) {
        return modelMapper.map(schoolRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid School ID: " + id)), SchoolDTO.class);
    }

    @Override
    public School createSchool(CreateSchoolDTO createSchoolDTO) {
        return schoolRepository.save(modelMapper.map(createSchoolDTO, School.class));
    }

    @Override
    public School updateSchool(long id, UpdateSchoolDTO updateSchoolDTO) {
        School school = modelMapper.map(updateSchoolDTO, School.class);
        school.setId(id);
        return schoolRepository.save(school);
    }

    @Override
    public void deleteSchool(long id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public List<School> findAllByName(String name) {
        return schoolRepository.findAllByName(name);
    }

    private SchoolDTO convertToSchoolDTO(School school) {
        return modelMapper.map(school, SchoolDTO.class);
    }
}

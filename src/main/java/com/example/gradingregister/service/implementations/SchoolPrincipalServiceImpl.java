package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateSchoolPrincipalDTO;
import com.example.gradingregister.data.dto.SchoolPrincipalDTO;
import com.example.gradingregister.data.dto.UpdateSchoolPrincipalDTO;
import com.example.gradingregister.data.entity.SchoolPrincipal;
import com.example.gradingregister.data.repository.SchoolPrincipalRepository;
import com.example.gradingregister.service.SchoolPrincipalService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SchoolPrincipalServiceImpl implements SchoolPrincipalService {
    private final SchoolPrincipalRepository schoolPrincipalRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<SchoolPrincipalDTO> getSchoolPrincipals() {
        return schoolPrincipalRepository.findAll().stream()
                .map(this::convertToSchoolPrincipalDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SchoolPrincipalDTO getSchoolPrincipal(long id) {
        return modelMapper.map(schoolPrincipalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid School Principal ID: " + id)), SchoolPrincipalDTO.class);
    }

    @Override
    public SchoolPrincipal createSchoolPrincipal(CreateSchoolPrincipalDTO createSchoolPrincipalDTO) {
        return schoolPrincipalRepository.save(modelMapper.map(createSchoolPrincipalDTO, SchoolPrincipal.class));
    }

    @Override
    public SchoolPrincipal updateSchoolPrincipal(long id, UpdateSchoolPrincipalDTO updateSchoolPrincipalDTO) {
        SchoolPrincipal schoolPrincipal = modelMapper.map(updateSchoolPrincipalDTO, SchoolPrincipal.class);
        schoolPrincipal.setId(id);
        return schoolPrincipalRepository.save(schoolPrincipal);
    }

    @Override
    public void deleteSchoolPrincipal(long id) {
        schoolPrincipalRepository.deleteById(id);
    }

    @Override
    public List<SchoolPrincipal> findAllByName(String name) {
        return schoolPrincipalRepository.findAllByName(name);
    }

    private SchoolPrincipalDTO convertToSchoolPrincipalDTO(SchoolPrincipal schoolPrincipal) {
        return modelMapper.map(schoolPrincipal, SchoolPrincipalDTO.class);
    }
}

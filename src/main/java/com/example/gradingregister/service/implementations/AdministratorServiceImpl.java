package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.AdministratorDTO;
import com.example.gradingregister.data.dto.CreateAdministratorDTO;
import com.example.gradingregister.data.dto.UpdateAdministratorDTO;
import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.repository.AdministratorRepository;
import com.example.gradingregister.service.AdministratorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdministratorServiceImpl implements AdministratorService {

    private final AdministratorRepository administratorRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AdministratorDTO> getAdministrators() {
        return administratorRepository.findAll().stream()
                .map(this::convertToAdministratorDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdministratorDTO getAdministrator(long id) {
        return modelMapper.map(administratorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Administrator ID: " + id)), AdministratorDTO.class);
    }

    @Override
    public Administrator createAdministrator(CreateAdministratorDTO createAdministratorDTO) {
        return administratorRepository.save(modelMapper.map(createAdministratorDTO, Administrator.class));
    }

    @Override
    public Administrator updateAdministrator(long id, UpdateAdministratorDTO updateAdministratorDTO) {
        Administrator administrator = modelMapper.map(updateAdministratorDTO, Administrator.class);
        administrator.setId(id);
        return administratorRepository.save(administrator);
    }

    @Override
    public void deleteAdministrator(long id) {
        administratorRepository.deleteById(id);
    }

    @Override
    public List<Administrator> findAllByName(String name) {
        return administratorRepository.findAllByName(name);
    }

    private AdministratorDTO convertToAdministratorDTO(Administrator administrator) {
        return modelMapper.map(administrator, AdministratorDTO.class);
    }
}

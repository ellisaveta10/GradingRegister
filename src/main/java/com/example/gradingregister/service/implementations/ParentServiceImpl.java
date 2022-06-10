package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateParentDTO;
import com.example.gradingregister.data.dto.ParentDTO;
import com.example.gradingregister.data.dto.UpdateParentDTO;
import com.example.gradingregister.data.entity.Parent;
import com.example.gradingregister.data.repository.ParentRepository;
import com.example.gradingregister.service.ParentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ParentServiceImpl implements ParentService {

    private final ParentRepository parentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ParentDTO> getParents() {
        return parentRepository.findAll().stream()
                .map(this::convertToParentDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ParentDTO getParent(long id) {
        return modelMapper.map(parentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Parent ID: " + id)), ParentDTO.class);
    }

    @Override
    public Parent createParent(CreateParentDTO createParentDTO) {
        return parentRepository.save(modelMapper.map(createParentDTO, Parent.class));
    }

    @Override
    public Parent updateParent(long id, UpdateParentDTO updateParentDTO) {
        Parent parent = modelMapper.map(updateParentDTO, Parent.class);
        parent.setId(id);
        return parentRepository.save(parent);
    }

    @Override
    public void deleteParent(long id) {
        parentRepository.deleteById(id);
    }

    @Override
    public List<Parent> findAllByName(String name) {
        return parentRepository.findAllByName(name);
    }

    private ParentDTO convertToParentDTO(Parent parent) {
        return modelMapper.map(parent, ParentDTO.class);
    }
}

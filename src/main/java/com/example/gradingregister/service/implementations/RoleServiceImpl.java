package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateRoleDTO;
import com.example.gradingregister.data.dto.RoleDTO;
import com.example.gradingregister.data.dto.UpdateRoleDTO;
import com.example.gradingregister.data.entity.Role;
import com.example.gradingregister.data.repository.RoleRepository;
import com.example.gradingregister.service.RoleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<RoleDTO> getRoles() {
        return roleRepository.findAll().stream()
                .map(this::convertToRoleDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RoleDTO getRole(long id) {
        return modelMapper.map(roleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Role ID: " + id)), RoleDTO.class);
    }

    @Override
    public Role createRole(CreateRoleDTO createRoleDTO) {
        return roleRepository.save(modelMapper.map(createRoleDTO, Role.class));
    }

    @Override
    public Role updateRole(long id, UpdateRoleDTO updateRoleDTO) {
        Role role = modelMapper.map(updateRoleDTO, Role.class);
        role.setId(id);
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public List<Role> findAllByName(String name) {
        return roleRepository.findAllByName(name);
    }

    private RoleDTO convertToRoleDTO(Role role) {
        return modelMapper.map(role, RoleDTO.class);
    }
}

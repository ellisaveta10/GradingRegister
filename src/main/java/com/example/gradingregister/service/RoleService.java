package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Role;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getRoles();

    RoleDTO getRole(long id);

    Role createRole(CreateRoleDTO createRoleDTO);

    Role updateRole(long id, UpdateRoleDTO updateRoleDTO);

    void deleteRole(long id);

    List<Role>findAllByName(String name);
}

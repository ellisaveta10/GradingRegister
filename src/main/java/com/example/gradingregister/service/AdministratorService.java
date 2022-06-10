package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.AdministratorDTO;
import com.example.gradingregister.data.dto.CreateAdministratorDTO;
import com.example.gradingregister.data.dto.UpdateAdministratorDTO;
import com.example.gradingregister.data.entity.Administrator;

import java.util.List;

public interface AdministratorService {
    List<AdministratorDTO> getAdministrators();

    AdministratorDTO getAdministrator(long id);

    Administrator createAdministrator(CreateAdministratorDTO createAdministratorDTO);

    Administrator updateAdministrator(long id, UpdateAdministratorDTO updateAdministratorDTO);

    void deleteAdministrator(long id);

    List<Administrator>findAllByName(String name);
}

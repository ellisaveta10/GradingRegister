package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Role;
import com.example.gradingregister.data.entity.SchoolPrincipal;

import java.util.List;

public interface SchoolPrincipalService {
    List<SchoolPrincipalDTO> getSchoolPrincipals();

    SchoolPrincipalDTO getSchoolPrincipal(long id);

    SchoolPrincipal createSchoolPrincipal(CreateSchoolPrincipalDTO createSchoolPrincipalDTO);

    SchoolPrincipal updateSchoolPrincipal(long id, UpdateSchoolPrincipalDTO updateSchoolPrincipalDTO);

    void deleteSchoolPrincipal(long id);

    List<SchoolPrincipal>findAllByName(String name);
}

package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.SchoolPrincipal;

import java.util.List;

public interface SchoolService {
    List<SchoolDTO> getSchools();

    SchoolDTO getSchool(long id);

    School createSchool(CreateSchoolDTO createSchoolDTO);

    School updateSchool(long id, UpdateSchoolDTO updateSchoolDTO);

    void deleteSchool(long id);

    List<School>findAllByName(String name);
}

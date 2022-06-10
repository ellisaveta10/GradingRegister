package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.data.entity.Parent;

import java.util.List;

public interface ParentService {
    List<ParentDTO> getParents();

    ParentDTO getParent(long id);

    Parent createParent(CreateParentDTO createParentDTO);

    Parent updateParent(long id, UpdateParentDTO updateParentDTO);

    void deleteParent(long id);

    List<Parent>findAllByName(String name);
}

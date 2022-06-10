package com.example.gradingregister.service;

import com.example.gradingregister.data.dto.*;
import com.example.gradingregister.data.entity.User;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();

    UserDTO getUser(long id);

    User createUser(CreateUserDTO createUserDTO);

    User updateUser(long id, UpdateUserDTO updateUserDTO);

    void deleteUser(long id);

    List<User>findAllByName(String name);
}

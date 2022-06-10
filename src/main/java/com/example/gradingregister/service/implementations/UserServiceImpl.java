package com.example.gradingregister.service.implementations;

import com.example.gradingregister.data.dto.CreateUserDTO;
import com.example.gradingregister.data.dto.UpdateUserDTO;
import com.example.gradingregister.data.dto.UserDTO;
import com.example.gradingregister.data.entity.User;
import com.example.gradingregister.data.repository.UserRepository;
import com.example.gradingregister.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToUserDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUser(long id) {
        return modelMapper.map(userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid User ID: " + id)), UserDTO.class);
    }

    @Override
    public User createUser(CreateUserDTO createUserDTO) {
        return userRepository.save(modelMapper.map(createUserDTO, User.class));
    }

    @Override
    public User updateUser(long id, UpdateUserDTO updateUserDTO) {
        User user = modelMapper.map(updateUserDTO, User.class);
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAllByName(String name) {
        return userRepository.findAllByUsername(name);
    }

    private UserDTO convertToUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }
}

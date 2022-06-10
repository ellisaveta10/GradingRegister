package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CreateAdministratorDTO {
    private String name;
    private User user;
    private School school;
}

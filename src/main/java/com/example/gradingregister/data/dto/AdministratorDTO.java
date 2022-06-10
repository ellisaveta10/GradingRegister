package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AdministratorDTO {
    private long id;
    private String name;
    private User user;
    private School school;
    private int deleted;
}

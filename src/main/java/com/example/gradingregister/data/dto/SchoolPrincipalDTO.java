package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Grade;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.Teacher;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class SchoolPrincipalDTO {
    private long id;
    private String name;
    private School school;
    private User user;
    private int deleted;
}

package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Grade;
import com.example.gradingregister.data.entity.Teacher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class SchoolDTO {
    private long id;
    private String name;
    private String address;
    private Set<Grade> grades;
    private Set<Teacher> teachers;
    private int deleted;
}

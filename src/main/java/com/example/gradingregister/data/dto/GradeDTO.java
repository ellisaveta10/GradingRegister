package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class GradeDTO {
    private long id;
    private String name;
    private School school;
    private Curriculum curriculum;
    private Set<Student> students;
    private int deleted;
}

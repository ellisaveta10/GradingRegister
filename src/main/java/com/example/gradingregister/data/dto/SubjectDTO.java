package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class SubjectDTO {
    private long id;
    private String name;
    private Set<Teacher> teachers;
    private Curriculum curriculum;
    private int deleted;
}

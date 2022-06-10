package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Curriculum;
import com.example.gradingregister.data.entity.Teacher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateSubjectDTO {
    private long id;
    private String name;
    private Set<Teacher> teachers;
    private Curriculum curriculum;
    private int deleted;
}

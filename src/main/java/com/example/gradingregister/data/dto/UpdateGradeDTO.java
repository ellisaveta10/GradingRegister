package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Curriculum;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateGradeDTO {
    private long id;
    private String name;
    private School school;
    private Curriculum curriculum;
    private Set<Student> students;
    private int deleted;
}

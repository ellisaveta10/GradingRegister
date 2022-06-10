package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Grade;
import com.example.gradingregister.data.entity.Subject;
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
public class CreateCurriculumDTO {
    private Set<Subject> subjects;
    private Set<Teacher> teachers;
}

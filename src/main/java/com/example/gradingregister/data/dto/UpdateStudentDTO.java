package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Grade;
import com.example.gradingregister.data.entity.Parent;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateStudentDTO {
    private long id;
    private String name;
    private Grade grade;
    private User user;
    private Parent parent;
    private int deleted;
}

package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.Student;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ParentDTO {
    private long id;
    private String name;
    private Set<Student> students;
    private User user;
    private int deleted;
}

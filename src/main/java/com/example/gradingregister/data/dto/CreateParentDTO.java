package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Student;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.OneToOne;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CreateParentDTO {
    private String name;
    private Set<Student> students;
    private User user;
}

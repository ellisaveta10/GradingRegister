package com.example.gradingregister.data.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="parent")
public class Parent extends BaseEntity{
    private String name;

    @OneToMany(mappedBy = "parent")
    private Set<Student> students;

    @OneToOne
    private User user;
}

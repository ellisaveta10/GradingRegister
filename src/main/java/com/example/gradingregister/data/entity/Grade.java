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
@Table(name="grade")
public class Grade extends BaseEntity{
    private String name;
    @ManyToOne
    @JoinColumn(name="school_id")
    private School school;

    @OneToMany(mappedBy = "grade")
    private Set<Student> students;

    @OneToOne
    private Curriculum curriculum;


}

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
@Table(name="curriculum")
public class Curriculum extends BaseEntity{

    @OneToMany(mappedBy = "curriculum")
    private Set<Subject> subjects;

    @ManyToMany
    @JoinTable(
            name = "teachers_curriculums",
            joinColumns = @JoinColumn(name = "curriculum_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teachers;

}

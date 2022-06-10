package com.example.gradingregister.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="student")
public class Student extends BaseEntity{
    private String name;

    @ManyToOne
    @JoinColumn(name="grade_id")
    private Grade grade;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;

}

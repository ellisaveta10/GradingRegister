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
@Table(name="teacher")
public class Teacher extends BaseEntity{
    private String name;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name="school_id")
    private School school;


}

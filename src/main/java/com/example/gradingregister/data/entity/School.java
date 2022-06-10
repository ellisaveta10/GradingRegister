package com.example.gradingregister.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="school")
public class School extends BaseEntity{
    private String name;

    private String address;

    @OneToMany(mappedBy = "school")
    private Set<Grade> grades;

    @OneToMany(mappedBy = "school")
    private Set<Teacher> teachers;



}

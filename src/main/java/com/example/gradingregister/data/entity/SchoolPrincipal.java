package com.example.gradingregister.data.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="school_principal")
public class SchoolPrincipal extends BaseEntity{
    private String name;

    @OneToOne
    private School school;

    @OneToOne
    private User user;
}

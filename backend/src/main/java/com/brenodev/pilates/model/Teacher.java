package com.brenodev.pilates.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_professor")
public class Teacher extends Person {

    @OneToMany(mappedBy = "teacher")
    private Set<Schedule> scheduleSet = new HashSet<>();

}

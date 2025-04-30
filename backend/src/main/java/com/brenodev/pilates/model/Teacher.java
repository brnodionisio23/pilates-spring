package com.brenodev.pilates.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_professor")
public class Teacher extends Person {

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Schedule> scheduleSet = new HashSet<>();

}

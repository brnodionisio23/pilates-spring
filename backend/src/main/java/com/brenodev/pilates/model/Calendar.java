package com.brenodev.pilates.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity(name = "tb_calendario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calendar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "data")
    private LocalDate date;

    @Column(name = "hora")
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}

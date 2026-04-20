package com.mazindere.assessment_prep.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employees")
@Data

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private double salary;
}

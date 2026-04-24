package com.mazindere.assessment_prep.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

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

    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    // can trim to remove millisecs & match mysql hh:mm:s createdAt = LocalDateTime.now().withNano(0);


}

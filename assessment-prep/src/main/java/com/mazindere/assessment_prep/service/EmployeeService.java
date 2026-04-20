package com.mazindere.assessment_prep.service;

import com.mazindere.assessment_prep.entity.Employees;

import java.util.Optional;

public interface EmployeeService {
    Employees getEmployee(Integer employeeId);
}

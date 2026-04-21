package com.mazindere.assessment_prep.service;

import com.mazindere.assessment_prep.entity.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employees getEmployee(Integer employeeId);

    List<Employees> getAllEmployees();

    void deleteByEmployeeId(Integer employeeId);

    Employees saveEmployee(Employees employee);

}

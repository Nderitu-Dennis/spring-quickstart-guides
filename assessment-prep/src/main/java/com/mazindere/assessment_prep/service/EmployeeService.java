package com.mazindere.assessment_prep.service;

import com.mazindere.assessment_prep.entity.Employees;

import java.util.List;

public interface EmployeeService {
    Employees getEmployee(Integer employeeId);

    List<Employees> getAllEmployees();

    void deleteById(Integer employeeId);
    /*
    * If the field is the primary key (@Id) → use deleteById
    * If it’s some other field (email, businessId, etc.) → use deleteByEmail, deleteByBusinessId, etc.
    */

    Employees saveEmployee(Employees employee);

}

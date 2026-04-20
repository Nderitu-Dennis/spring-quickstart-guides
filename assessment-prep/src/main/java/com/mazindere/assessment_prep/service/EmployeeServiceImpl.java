package com.mazindere.assessment_prep.service;

import com.mazindere.assessment_prep.entity.Employees;
import com.mazindere.assessment_prep.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public  EmployeeServiceImpl (EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employees getEmployee(Integer employeeId) {
        return employeeRepository.findEmployeeByEmployeeId(employeeId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Employee with id " + employeeId + " not found"));

    }
}

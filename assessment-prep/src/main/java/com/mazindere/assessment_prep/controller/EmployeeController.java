package com.mazindere.assessment_prep.controller;

import com.mazindere.assessment_prep.entity.Employees;
import com.mazindere.assessment_prep.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/{employeeId}")
    public ResponseEntity<Employees> getEmployee (@PathVariable Integer employeeId){
        return ResponseEntity.ok(employeeService.getEmployee(employeeId));

    }

    //ResponseEntity-full HTTP response (status code, headers, body)

}

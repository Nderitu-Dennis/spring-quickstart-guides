package com.mazindere.assessment_prep.controller;

import com.mazindere.assessment_prep.entity.Employees;
import com.mazindere.assessment_prep.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employees> getEmployee (@PathVariable Integer employeeId){
        return ResponseEntity.ok(employeeService.getEmployee(employeeId));

    }

    //ResponseEntity-full HTTP response (status code, headers, body)

@GetMapping("/employees")
    public ResponseEntity<List<Employees>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
}

@PostMapping("/saveEmployee")
    public ResponseEntity<Employees> saveEmployee (@RequestBody Employees employee){
        //todo - check request body n more of POST ops
        return ResponseEntity.status(201).body(employeeService.saveEmployee(employee));
}

@DeleteMapping("/employee/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteById(employeeId);
        return ResponseEntity.noContent().build();
}

}

package com.mazindere.assessment_prep.service;

import com.mazindere.assessment_prep.entity.Employees;
import com.mazindere.assessment_prep.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public  EmployeeServiceImpl (EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employees getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Employee with id " + employeeId + " not found"));

    }

    @Override
    public List<Employees> getAllEmployees() {
//todo       print w an enhanced for loop?
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer employeeId) {
        if(!employeeRepository.existsById(employeeId)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, //todo- diff btwn throw & or else throw
                    "Employee with id " + employeeId + " not found");
        }
        employeeRepository.deleteById(employeeId);


    }


    @Override
    @Transactional
    public Employees saveEmployee(Employees employee) {
        return employeeRepository.save(employee);
    }
}

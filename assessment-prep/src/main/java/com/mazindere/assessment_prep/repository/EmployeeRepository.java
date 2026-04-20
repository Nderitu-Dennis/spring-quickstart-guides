package com.mazindere.assessment_prep.repository;

import com.mazindere.assessment_prep.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
    Optional<Employees> findEmployeeByEmployeeId(Integer employeeId);

}

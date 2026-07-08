package com.cognizant.ormapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormapping.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
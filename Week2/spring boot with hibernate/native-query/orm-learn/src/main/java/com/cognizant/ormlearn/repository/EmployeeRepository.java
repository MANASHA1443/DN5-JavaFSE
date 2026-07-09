package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // HQL Query
    @Query("""
            SELECT DISTINCT e
            FROM Employee e
            LEFT JOIN FETCH e.department
            LEFT JOIN FETCH e.skillList
            WHERE e.permanent = true
            """)
    List<Employee> getAllPermanentEmployees();

    // Native Query
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();

}
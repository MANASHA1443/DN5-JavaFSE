package com.cognizant.ormapping.service;

import com.cognizant.ormapping.model.Employee;
import com.cognizant.ormapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // CREATE
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // READ ALL
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // READ BY ID
    public Employee getEmployee(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // DELETE
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
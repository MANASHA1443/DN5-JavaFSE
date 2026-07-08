package com.cognizant.ormapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormapping.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
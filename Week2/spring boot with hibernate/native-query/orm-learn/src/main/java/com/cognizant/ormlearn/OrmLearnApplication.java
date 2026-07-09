package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @PostConstruct
    public void run() {

        testGetAllPermanentEmployees();

        testGetAllEmployeesNative();
    }

    private void testGetAllPermanentEmployees() {

        System.out.println("\n=========== HQL QUERY ===========");

        List<Employee> employees = employeeService.getAllPermanentEmployees();

        System.out.println("Permanent Employees : " + employees.size());

        for (Employee e : employees) {

            System.out.println("------------------------------------");
            System.out.println("ID         : " + e.getId());
            System.out.println("Name       : " + e.getName());
            System.out.println("Salary     : " + e.getSalary());
            System.out.println("Department : " + e.getDepartment().getName());

            System.out.println("Skills");

            for (Skill s : e.getSkillList()) {
                System.out.println("   - " + s.getName());
            }
        }
    }

    private void testGetAllEmployeesNative() {

        System.out.println("\n=========== NATIVE QUERY ===========");

        List<Employee> employees = employeeService.getAllEmployeesNative();

        System.out.println("Total Employees : " + employees.size());

        for (Employee e : employees) {

            System.out.println("------------------------------------");
            System.out.println("ID        : " + e.getId());
            System.out.println("Name      : " + e.getName());
            System.out.println("Salary    : " + e.getSalary());
            System.out.println("Permanent : " + e.isPermanent());
        }
    }
}
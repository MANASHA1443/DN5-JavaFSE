package com.cognizant.ormapping;

import com.cognizant.ormapping.model.Department;
import com.cognizant.ormapping.model.Employee;
import com.cognizant.ormapping.model.Skill;
import com.cognizant.ormapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class OrmappingApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Create Department
        Department department = new Department();
        department.setName("Development");

        // Create Skills
        Skill java = new Skill();
        java.setName("Java");

        Skill spring = new Skill();
        spring.setName("Spring Boot");

        // Create Employee
        Employee employee = new Employee();
        employee.setName("Manasha");
        employee.setSalary(50000);
        employee.setPermanent(true);
        employee.setDateOfBirth(
                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2003"));

        employee.setDepartment(department);
        employee.setSkills(Arrays.asList(java, spring));

        // SAVE
        employeeService.saveEmployee(employee);

        System.out.println("========== EMPLOYEE SAVED ==========");

        // READ
        Employee emp = employeeService.getEmployee(employee.getId());

        if (emp != null) {
            System.out.println("Id : " + emp.getId());
            System.out.println("Name : " + emp.getName());
            System.out.println("Salary : " + emp.getSalary());
            System.out.println("Department : " + emp.getDepartment().getName());

            System.out.println("Skills:");

            emp.getSkills().forEach(skill ->
                    System.out.println(skill.getName()));
        }

        // UPDATE
        emp.setSalary(60000);
        employeeService.updateEmployee(emp);

        System.out.println("Employee Updated Successfully");

        // DELETE (optional)
        // employeeService.deleteEmployee(emp.getId());
        // System.out.println("Employee Deleted Successfully");
    }
}
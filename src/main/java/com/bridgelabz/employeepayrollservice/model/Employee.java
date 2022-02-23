package com.bridgelabz.employeepayrollservice.model;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

//Map to a database table by name employee
@Entity
//Use to bundle features of getter and setter
@Data

//Created Employee class with different fields
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private String profilePic;
    private String department;
    private Long salary;
    private LocalDate date;
    private String notes;

    public Employee() {
        super();
    }

    public Employee(EmployeeDTO dto) {
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.profilePic = dto.getProfilePic();
        this.department = dto.getDepartment();
        this.salary = dto.getSalary();
        this.date = dto.getDate();
        this.notes = dto.getNotes();
    }

    public Employee(Integer id, EmployeeDTO employeeDTO) {
        super();
        this.id = id;
        this.firstName = employeeDTO.getFirstName();
        this.lastName = employeeDTO.getLastName();
        this.profilePic = employeeDTO.getProfilePic();
        this.department = employeeDTO.getDepartment();
        this.salary = employeeDTO.getSalary();
        this.date = employeeDTO.getDate();
        this.notes = employeeDTO.getNotes();
    }
}
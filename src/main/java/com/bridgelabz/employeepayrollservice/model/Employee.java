package com.bridgelabz.employeepayrollservice.model;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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


    @ElementCollection
    @CollectionTable(name="employee_department",joinColumns= @JoinColumn(name="id"))
    private List<String> department;
    private Long salary;
    private String gender;
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
        this.gender = dto.getGender();
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
        this.gender = employeeDTO.getGender();
        this.date = employeeDTO.getDate();
        this.notes = employeeDTO.getNotes();
    }
}
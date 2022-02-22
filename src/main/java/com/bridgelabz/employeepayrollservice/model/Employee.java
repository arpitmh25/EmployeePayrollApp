package com.bridgelabz.employeepayrollservice.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getProfilePic() {
//        return profilePic;
//    }
//
//    public void setProfilePic(String profilePic) {
//        this.profilePic = profilePic;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public Long getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Long salary) {
//        this.salary = salary;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public String getNotes() {
//        return notes;
//    }
//
//    public void setNotes(String notes) {
//        this.notes = notes;
//    }
}
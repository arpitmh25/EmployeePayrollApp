package com.bridgelabz.employeepayrollservice.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String profilePic;
    private String department;
    private Long salary;
    private LocalDate date;
    private String notes;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String firstName, String lastName, String profilePic, String department, Long salary,
                       LocalDate date, String notes) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.department = department;
        this.salary = salary;
        this.date = date;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getProfilePic() {
        return profilePic;
    }


    public String getDepartment() {
        return department;
    }


    public Long getSalary() {
        return salary;
    }


    public LocalDate getDate() {
        return date;
    }


    public String getNotes() {
        return notes;
    }

}
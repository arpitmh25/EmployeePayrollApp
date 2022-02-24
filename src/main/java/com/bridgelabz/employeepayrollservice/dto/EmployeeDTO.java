package com.bridgelabz.employeepayrollservice.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

//Created EmployeeDTO class and added validations to fields
@Data
public class EmployeeDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee firstName is Invalid")
    private String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee lastName is Invalid")
    private String lastName;

    @NotEmpty(message = "ProfilePic cannot be null")
    private String profilePic;

    @NotEmpty(message = "Department name cannot be null")
    private List<String> department;

    @Pattern(regexp = "male | female", message = "Gender needs to be male or female")
    private String gender;

    @Min(value = 500, message = "Salary should be more than 500")
    private Long salary;

    @PastOrPresent(message = "Date should be past or today date")
    private LocalDate date;
    private String notes;

    public EmployeeDTO() {
        super();
    }
}
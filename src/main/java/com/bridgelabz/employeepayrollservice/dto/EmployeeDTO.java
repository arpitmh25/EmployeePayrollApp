package com.bridgelabz.employeepayrollservice.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

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
    private String department;

    @Min(value = 500, message = "Salary should be more than 500")
    private Long salary;

    @PastOrPresent(message = "Date should be past or today date")
    private LocalDate date;
    private String notes;

    public EmployeeDTO() {
        super();
    }
}
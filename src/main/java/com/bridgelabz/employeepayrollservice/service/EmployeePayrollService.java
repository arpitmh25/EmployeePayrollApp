package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    public String getMessage(String name) {
        return "Welcome To Employee Program " + name;
    }

    public String postMessage(Employee employee) {
        return "Hello Employee " + employee.getFirstName() + "" + employee.getLastName() + "!";
    }

    public String putMessage(String name) {
        return "Hey Dude , " + name;
    }

}

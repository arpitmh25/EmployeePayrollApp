package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.model.Employee;

public interface IEmployeePayrollService {
    String getMessage(String name);

    String postMessage(Employee employee);

    String putMessage(String name);
}

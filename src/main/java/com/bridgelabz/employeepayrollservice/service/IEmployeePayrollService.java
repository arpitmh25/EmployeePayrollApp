package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollservice.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    String getMessage(String name);

    String postMessage(Employee employee);

    String putMessage(String name);

    String getWelcome();

    public Employee postDataToRepo(Employee employee);

    public List<Employee> getAllData();

    public Employee getDataById(Integer id);

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO);

    public String deleteDataById(Integer id);
}

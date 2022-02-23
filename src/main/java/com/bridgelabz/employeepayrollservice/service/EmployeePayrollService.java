package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollservice.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollservice.model.Employee;
import com.bridgelabz.employeepayrollservice.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

//Created EmployeePayrollService class to serve api calls done by controller layer
public class EmployeePayrollService implements IEmployeePayrollService {

    //Autowired EmployeePayrollRepository interface to inject its dependency here
    @Autowired
    EmployeePayrollRepository repository;

    public String getWelcome() {
        return "Welcome to Employee Payroll !!!";
    }

    public Employee postDataToRepo(EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee(employeeDTO);
        repository.save(newEmployee);
        return newEmployee;
    }

    public List<Employee> getAllData() {
        List<Employee> list = repository.findAll();
        return list;
    }

    public Employee getDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        if (newEmployee.isPresent()) {
            return newEmployee.get();
        } else throw new EmployeePayrollException("Employee id not found");
    }

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO) {
        Optional<Employee> newEmployee = repository.findById(id);
        if (newEmployee.isPresent()) {
            Employee employee = new Employee(id, employeeDTO);
            repository.save(employee);
            return employee;
        } else {
            throw new EmployeePayrollException("Employee Not found");
        }
    }

    public String deleteDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        if (newEmployee.isEmpty()) {
            throw new EmployeePayrollException("Employee Details not found");
        } else {
            repository.deleteById(id);
        }
        return null;
    }
}
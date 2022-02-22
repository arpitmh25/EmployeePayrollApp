package com.bridgelabz.employeepayrollservice.service;

import java.util.List;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollservice.model.Employee;
import com.bridgelabz.employeepayrollservice.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    @Autowired
    EmployeePayrollRepository repository;

    public String getMessage(String name) {
        return "Welcome " + name;
    }

    public String postMessage(EmployeeDTO employeeDTO) {
        return "Hello " + employeeDTO.getFirstName() + "" + employeeDTO.getLastName() + "!";
    }

    public String putMessage(String name) {
        return "How are you, " + name;
    }

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
        Employee newEmployee = repository.getById(id);
        return newEmployee;
    }

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee(id, employeeDTO);
        repository.save(newEmployee);
        return newEmployee;
    }

    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return null;
    }
}
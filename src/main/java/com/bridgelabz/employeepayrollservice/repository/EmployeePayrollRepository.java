package com.bridgelabz.employeepayrollservice.repository;

import com.bridgelabz.employeepayrollservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}

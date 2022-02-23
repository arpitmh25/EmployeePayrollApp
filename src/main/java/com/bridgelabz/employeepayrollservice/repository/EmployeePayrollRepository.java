package com.bridgelabz.employeepayrollservice.repository;

import com.bridgelabz.employeepayrollservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//Created EmployeePayrollRepository class extending JpaRepository for CRUD operations and for some custom query methods
public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}

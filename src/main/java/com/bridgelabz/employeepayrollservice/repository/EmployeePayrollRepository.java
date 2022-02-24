package com.bridgelabz.employeepayrollservice.repository;

import com.bridgelabz.employeepayrollservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Created EmployeePayrollRepository class extending JpaRepository for CRUD operations and for some custom query methods
public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
    @Query(value="select * from employee ,employee_department where employee.id=employee_department.id and department= :department",nativeQuery=true)
    List<Employee> findByDepartment(String department);

}

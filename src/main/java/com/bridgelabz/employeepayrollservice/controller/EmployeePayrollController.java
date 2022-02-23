package com.bridgelabz.employeepayrollservice.controller;

import com.bridgelabz.employeepayrollservice.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollservice.dto.ResponseDTO;
import com.bridgelabz.employeepayrollservice.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollservice.model.Employee;
import com.bridgelabz.employeepayrollservice.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//Created controller so that we can perform rest api calls
@RestController
@RequestMapping("/employeepayrollservice")

public class EmployeePayrollController {

    //Autowired IEmployeePayrollService interface so we can inject its dependency here
    @Autowired
    IEmployeePayrollService service;

    //Ability to display welcome message
    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcome() {
        String welcome = service.getWelcome();
        return new ResponseEntity<String>(welcome, HttpStatus.OK);
    }

    //Ability to save employee data to repo
    @PostMapping("/create")
    public ResponseEntity<String> addDataToRepo(@Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee newEmployee = service.postDataToRepo(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Record Added Succesfully", newEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.CREATED);
    }

    //Ability to get all employees data by findAll() method
    @GetMapping("/get")
    public ResponseEntity<String> getAllDataFromRepo() {
        List<Employee> listOfEmployee = service.getAllData();
        ResponseDTO responseDTO = new ResponseDTO("Record Retrieved Successfully", listOfEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    //Ability to get employee data by id
    @GetMapping("/get/{id}")
    public ResponseEntity<String> getDataFromRepoById(@PathVariable Integer id) throws EmployeePayrollException {
        Employee existingEmployee = service.getDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Record for given ID Retrieved Successfully", existingEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    //Ability to update employee data for particular id
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id,
                                                   @Valid @RequestBody EmployeeDTO employeeDTO)
            throws EmployeePayrollException {
        Employee updatedEmployee = service.updateDataById(id, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Record for particular ID Updated Successfully", updatedEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
    }

    //Ability to delete employee data for particular id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id) throws EmployeePayrollException {
        ResponseDTO responseDTO = new ResponseDTO
                ("Record for particular ID Deleted Successfully", service.deleteDataById(id));
        return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
    }
}
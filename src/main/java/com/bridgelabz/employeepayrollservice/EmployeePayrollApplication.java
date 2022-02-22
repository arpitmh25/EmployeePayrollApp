package com.bridgelabz.employeepayrollservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication
                                                 .run(EmployeePayrollApplication.class, args);
        log.info("Employee payroll app started in the {} Environment", context.getEnvironment().getProperty("environment"));
        log.info("Address Book DB User is{}", context.getEnvironment().getProperty("spring.datasource.username"));
    }
}

package com.example.springRestDemo.controller;

import com.example.springRestDemo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id) {
        Employee employee = new Employee();
        employee.setDept("IT");
        employee.setId(id);
        employee.setName("Santhosh");
        return employee;
    }

}

package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee_management/list/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employee list
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    //insert/create employee api

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
    return employeeRepository.save(employee);
    }
}

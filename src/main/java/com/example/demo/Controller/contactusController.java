package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.contactusService;
import com.example.demo.models.contactus;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class contactusController {
    private final contactusService employeeService;

    public contactusController(contactusService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<contactus> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public contactus createEmployee(@RequestBody contactus employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/login")
    public Optional<contactus> login(@RequestBody contactus employee) {
        return employeeService.getEmployeeByUserName(employee.getUserName());
    }
}

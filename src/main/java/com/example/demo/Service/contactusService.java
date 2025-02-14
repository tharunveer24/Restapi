package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.contactusRepository;
import com.example.demo.models.contactus;

import java.util.List;
import java.util.Optional;

@Service
public class contactusService {
    private final contactusRepository employeeRepository;

    public contactusService(contactusRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<contactus> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public contactus saveEmployee(contactus employee) {
        return employeeRepository.save(employee);
    }

    public Optional<contactus> getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
}

package com.example.service;

import java.util.List;

import com.example.entity.EmployeeEntity;

public interface EmployeeService {
    
    public EmployeeEntity createEmployee(EmployeeEntity employee);
    
    public EmployeeEntity getEmployeeById(Long employeeId);
    
    public List<EmployeeEntity> getActiveEmployees();
    
}

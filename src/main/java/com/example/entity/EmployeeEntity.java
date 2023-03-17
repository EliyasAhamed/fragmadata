package com.example.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    
    private String employeeName;
    
    private String designation;
    
    private LocalDate joiningDate;
    
    private String emailId;
    
    private String mobileNum;
    
    private String gender;
    
    private String status;
    
    private String address;
    
    private String city;
    
    private String state;
    
    private String country;
    
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    
    @Column(name = "created_by")
    private String createdBy;

    // getters and setters
    
}

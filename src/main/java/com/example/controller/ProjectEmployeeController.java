package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ProjectEmployee;
import com.example.service.ProjectEmployeeService;

@RestController
@RequestMapping("/project-employee")
public class ProjectEmployeeController {

    @Autowired
    private ProjectEmployeeService projectEmployeeService;

    @PostMapping("/link-project-employee")
    public ProjectEmployee linkProjectEmployee(@RequestBody ProjectEmployee projectEmployee) {
        return projectEmployeeService.linkProjectEmployee(projectEmployee);
    }

    @PutMapping("/update-project-employee-end-date/{id}")
    public ProjectEmployee updateProjectEmployeeEndDate(@PathVariable Long id, @RequestBody ProjectEmployee projectEmployee) {
        return projectEmployeeService.updateProjectEmployeeEndDate(id, projectEmployee);
    }
}

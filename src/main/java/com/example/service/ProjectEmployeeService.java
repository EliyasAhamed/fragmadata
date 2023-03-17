package com.example.service;

import com.example.entity.ProjectEmployee;

public interface ProjectEmployeeService {
	
    ProjectEmployee linkProjectEmployee(ProjectEmployee projectEmployee);
    ProjectEmployee updateProjectEmployeeEndDate(Long id, ProjectEmployee projectEmployee);
}

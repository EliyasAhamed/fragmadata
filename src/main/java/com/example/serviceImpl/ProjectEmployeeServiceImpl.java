package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ProjectEmployee;
import com.example.repository.ProjectEmployeeRepository;
import com.example.service.ProjectEmployeeService;

@Service
public class ProjectEmployeeServiceImpl implements ProjectEmployeeService {

    @Autowired
    private ProjectEmployeeRepository projectEmployeeRepository;

    @Override
    public ProjectEmployee linkProjectEmployee(ProjectEmployee projectEmployee) {
        return projectEmployeeRepository.save(projectEmployee);
    }

    @Override
    public ProjectEmployee updateProjectEmployeeEndDate(Long id, ProjectEmployee projectEmployee) {
        ProjectEmployee existingProjectEmployee = projectEmployeeRepository.findById(id)
                .orElseThrow();

        existingProjectEmployee.setEndDate(projectEmployee.getEndDate());
        existingProjectEmployee.setStatus(projectEmployee.getStatus());
        return projectEmployeeRepository.save(existingProjectEmployee);
    }
}

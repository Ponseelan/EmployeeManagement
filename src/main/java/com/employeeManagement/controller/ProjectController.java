package com.employeeManagement.controller;

import com.employeeManagement.Model.Project;
import com.employeeManagement.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public Project getTest(@RequestBody Project project)
    {
       var t= projectService.createProject(project);
       return t;
    }
}

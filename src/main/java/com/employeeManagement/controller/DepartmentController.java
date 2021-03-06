package com.employeeManagement.controller;

import com.employeeManagement.Model.Department;
import com.employeeManagement.Model.DepartmentProject;
import com.employeeManagement.Service.DepartmentProjectService;
import com.employeeManagement.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentProjectService departmentProjectService;
    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department)
    {
        return departmentService.createDepartment(department);
    }
    @PostMapping("/department/{departmentId}/project")
    public DepartmentProject createDepartment(@PathVariable Integer departmentId,@RequestBody Map<String,Object> payload)
    {
        var departmentProject=DepartmentProject.create(departmentId,(int)payload.getOrDefault("id",0));
        return departmentProjectService.addProject(departmentProject);
    }
}

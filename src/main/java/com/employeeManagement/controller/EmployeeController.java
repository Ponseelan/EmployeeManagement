package com.employeeManagement.controller;

import com.employeeManagement.Model.Employee;
import com.employeeManagement.Model.EmployeeDepartment;
import com.employeeManagement.Model.EmployeeProject;
import com.employeeManagement.Service.EmployeeDepartmentService;
import com.employeeManagement.Service.EmployeeProjectService;
import com.employeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDepartmentService employeeDepartmentService;
    @Autowired
    private EmployeeProjectService employeeProjectService;

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> get(@RequestParam(required = false,defaultValue ="0") int projectId) {
        if(projectId>0) return employeeService.getEmployeesByProjectId(projectId);
        return employeeService.get();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/employee/{employeeId}/department")
    public EmployeeDepartment addDepartment(@PathVariable Integer employeeId, @RequestBody Map<String, Object> requestMap) {
        var employeeDepartment = EmployeeDepartment.create(employeeId, (int) requestMap.getOrDefault("id", 0));
        return employeeDepartmentService.addDepartment(employeeDepartment);
    }

    @PostMapping("/employee/{employeeId}/project")
    public EmployeeProject addProject(@PathVariable Integer employeeId, @RequestBody Map<String, Object> requestMap) {
        var employeeProject = EmployeeProject.create(employeeId, (int) requestMap.getOrDefault("id", 0));
        return employeeProjectService.addProject(employeeProject);
    }

    @PostMapping("/employee/{employeeId}/project/{projectId}/dissociate")
    public int dissociateProject(@PathVariable Integer employeeId, @PathVariable Integer projectId) {
        return employeeProjectService.dissociateProject(employeeId,projectId);
    }



}

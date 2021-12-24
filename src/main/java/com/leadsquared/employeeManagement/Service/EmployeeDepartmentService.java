package com.leadsquared.employeeManagement.Service;

import com.leadsquared.employeeManagement.Model.EmployeeDepartment;
import com.leadsquared.employeeManagement.Repository.EmployeeDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDepartmentService {
    @Autowired
    private EmployeeDepartmentRepository employeeDepartmentRepository;
    public EmployeeDepartment addDepartment(EmployeeDepartment employeeDepartment){
        return employeeDepartmentRepository.save(employeeDepartment);
    }
}

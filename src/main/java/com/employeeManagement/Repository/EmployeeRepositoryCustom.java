package com.employeeManagement.Repository;

import com.employeeManagement.Model.Employee;

import java.util.List;

public interface EmployeeRepositoryCustom {
    List<Employee> getEmployeeByProject();
}

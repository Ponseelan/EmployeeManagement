package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.Employee;

import java.util.List;

public interface EmployeeRepositoryCustom {
    List<Employee> getEmployeeByProject();
}

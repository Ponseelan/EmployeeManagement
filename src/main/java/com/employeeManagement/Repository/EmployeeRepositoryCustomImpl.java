package com.employeeManagement.Repository;

import com.employeeManagement.Model.Employee;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom{

    private EntityManager entityManager;
    @Override
    public List<Employee> getEmployeeByProject() {
return null;
    }
}

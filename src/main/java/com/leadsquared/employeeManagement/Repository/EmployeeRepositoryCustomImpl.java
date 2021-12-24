package com.leadsquared.employeeManagement.Repository;

import com.leadsquared.employeeManagement.Model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom{

    private EntityManager entityManager;
    @Override
    public List<Employee> getEmployeeByProject() {
return null;
    }
}

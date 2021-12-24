package com.employeeManagement.Service;

import com.employeeManagement.Model.Module;
import com.employeeManagement.Repository.EmployeeRepository;
import com.employeeManagement.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CounterService counterService;
    public Employee addEmployee(Employee employee)
    {
        employee.setEmpCode(Employee.EMP_CODE_SIGN+counterService.getNextValue(Module.EMPLOYEE));
        return employeeRepository.save(employee);
    }

    public List<Employee> get() {
        return employeeRepository.findAll();

    }

    public List<Employee> getEmployeesByProjectId(int projectId) {
return employeeRepository.getEmployeeByProject(projectId);
    }
}

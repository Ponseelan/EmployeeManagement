package com.leadsquared.employeeManagement.Service;

import com.leadsquared.employeeManagement.Model.Department;
import com.leadsquared.employeeManagement.Model.Module;
import com.leadsquared.employeeManagement.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
@Autowired
private CounterService counterService;
    public Department createDepartment(Department department)
    {
        department.setDepartCode(Department.DEPT_CODE_SIGN+counterService.getNextValue(Module.DEPARTMENT));
        return departmentRepository.save(department);
    }

}

package com.employeeManagement.Service;

import com.employeeManagement.Model.Module;
import com.employeeManagement.Model.Department;
import com.employeeManagement.Repository.DepartmentRepository;
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

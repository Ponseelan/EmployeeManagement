package com.leadsquared.employeeManagement.Service;

import com.leadsquared.employeeManagement.Model.DepartmentProject;
import com.leadsquared.employeeManagement.Repository.DepartmentProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentProjectService {
@Autowired
    private DepartmentProjectRepository departmentProjectRepository;
    public DepartmentProject addProject(DepartmentProject departmentProject)
    {
        return departmentProjectRepository.save(departmentProject);
    }

}

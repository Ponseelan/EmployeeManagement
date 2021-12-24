package com.employeeManagement.Service;

import com.employeeManagement.Model.DepartmentProject;
import com.employeeManagement.Repository.DepartmentProjectRepository;
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

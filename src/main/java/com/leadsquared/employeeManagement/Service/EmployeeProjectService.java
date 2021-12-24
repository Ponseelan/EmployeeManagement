package com.leadsquared.employeeManagement.Service;

import com.leadsquared.employeeManagement.Exception.DuplicateProjectAssignmentException;
import com.leadsquared.employeeManagement.Model.CustomError;
import com.leadsquared.employeeManagement.Model.EmployeeProject;
import com.leadsquared.employeeManagement.Repository.EmployeeProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProjectService {
    @Autowired
    private EmployeeProjectRepository employeeProjectRepository;
    public EmployeeProject addProject(EmployeeProject employeeProject)
    {
        EmployeeProject newEntity;
        try {
            newEntity= employeeProjectRepository.save(employeeProject);
        }
        catch(DataIntegrityViolationException ex)
        {
            CustomError customError=new CustomError(ex.getMessage(),"Employee",employeeProject);
               throw new DuplicateProjectAssignmentException(customError);
        }
        return newEntity;
    }

    public int dissociateProject(int employeeId, int projectId) {
     return   employeeProjectRepository.dissociateProject(employeeId,projectId);
    }
}

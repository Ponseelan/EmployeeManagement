package com.employeeManagement.Service;

import com.employeeManagement.Model.Module;
import com.employeeManagement.Repository.ProjectRepository;
import com.employeeManagement.Model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private CounterService counterService;
    public Project createProject(Project project) {
        int nextValue=counterService.getNextValue(Module.PROJECT);
        project.setProject_code(Project.PROJECT_CODE_SIGN+nextValue);
        return projectRepository.save(project);
    }
}

package com.leadsquared.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DepartmentProject {
    @GeneratedValue
    @Id
    private int id;

    private int department_id;

    private int project_id;

    public DepartmentProject() {
    }

    public DepartmentProject(int department_id, int project_id) {
        this.department_id = department_id;
        this.project_id = project_id;
    }

    public static DepartmentProject create(int departmentId,int projectId) {
        return  new DepartmentProject(departmentId,projectId);
    }
}

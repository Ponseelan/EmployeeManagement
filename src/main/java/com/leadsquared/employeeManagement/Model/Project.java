package com.leadsquared.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects")
@Getter
@Setter
public class Project {
    public static final String  PROJECT_CODE_SIGN="PROJ_";
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String project_code;
}

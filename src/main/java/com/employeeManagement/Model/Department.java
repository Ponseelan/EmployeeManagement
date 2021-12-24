package com.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Department {

    public static final String  DEPT_CODE_SIGN="DEPT_";
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private String departCode;

}

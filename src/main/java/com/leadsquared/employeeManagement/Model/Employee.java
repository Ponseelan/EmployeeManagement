package com.leadsquared.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employees")
@Setter
@Getter
public class Employee {
    public static final String  EMP_CODE_SIGN="DEPT_";
    @GeneratedValue
    @Id
    private int id;
    private String empCode;
    private String name;

    @OneToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "employee_Id",
            referencedColumnName = "id",
            insertable = false, updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private List<EmployeeDepartment> employeeDepartments;

    @OneToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "employeeId",
            referencedColumnName = "id",
            insertable = false, updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private List<EmployeeProject> employeeProjects;
}

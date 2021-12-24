package com.leadsquared.employeeManagement.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class EmployeeDepartment {
    @GeneratedValue
    @Id
    private int id;
    @Getter(AccessLevel.NONE)
    @Column(name = "employee_Id")
    private int employeeId;
    @Column(name = "department_Id")
    @Getter(AccessLevel.NONE)
    private int departmentId;


    @OneToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "department_Id",
            referencedColumnName = "id",
            insertable = false, updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Department department;

    public EmployeeDepartment() {
    }

    public EmployeeDepartment(int employeeId, int departmentId) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
    }

    public static EmployeeDepartment create(Integer employeeId, Integer departmentId) {
        return new EmployeeDepartment(employeeId,departmentId);
    }
}

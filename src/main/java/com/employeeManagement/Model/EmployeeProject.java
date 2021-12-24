package com.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"isActive","employeeId","projectId"})})
public class EmployeeProject {
    @GeneratedValue
    @Id
    private int id;
  //  @Getter(AccessLevel.NONE)
    private int employeeId;
    //@Getter(AccessLevel.NONE)
    private int projectId;
    private boolean isActive;


    @OneToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "projectId",
            referencedColumnName = "id",
            insertable = false, updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Project project;

    public EmployeeProject() {
    }

    public EmployeeProject(int employeeId, int projectId) {
        this.employeeId = employeeId;
        this.projectId = projectId;
        this.isActive = true;
    }

    public static EmployeeProject create(Integer employeeId, int projectId) {
        return new EmployeeProject(employeeId,projectId);
    }
}

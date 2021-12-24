package com.leadsquared.employeeManagement.Model;

import com.leadsquared.employeeManagement.Service.CounterService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

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

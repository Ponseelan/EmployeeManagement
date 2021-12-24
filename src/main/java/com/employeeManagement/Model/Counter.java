package com.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Counter {
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    public Module module;
    public int value;
}

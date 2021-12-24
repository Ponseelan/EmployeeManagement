package com.leadsquared.employeeManagement.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomError {
    private String message;
    private String entity;
    private Object entityNaturalId;

    public CustomError() {
    }

    public CustomError(String message, String entity, Object entityNaturalId) {
        this.message = message;
        this.entity = entity;
        this.entityNaturalId = entityNaturalId;
    }
}

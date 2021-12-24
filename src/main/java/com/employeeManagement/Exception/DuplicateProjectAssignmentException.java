package com.employeeManagement.Exception;

import com.employeeManagement.Model.CustomError;
import lombok.Getter;

@Getter
public class DuplicateProjectAssignmentException extends RuntimeException {
    private CustomError customError;

    public DuplicateProjectAssignmentException(CustomError customError) {
        super(customError.getMessage());
        this.customError=customError;

    }
}

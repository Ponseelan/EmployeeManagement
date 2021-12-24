package com.leadsquared.employeeManagement.Exception;

import com.leadsquared.employeeManagement.Model.CustomError;
import lombok.Getter;
import net.bytebuddy.implementation.bytecode.Throw;

@Getter
public class DuplicateProjectAssignmentException extends RuntimeException {
    private CustomError customError;

    public DuplicateProjectAssignmentException(CustomError customError) {
        super(customError.getMessage());
        this.customError=customError;

    }
}

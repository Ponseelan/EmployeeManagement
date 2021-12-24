package com.leadsquared.employeeManagement.ExceptionHandler;

import com.leadsquared.employeeManagement.Exception.DuplicateProjectAssignmentException;
import com.leadsquared.employeeManagement.Model.CustomError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DuplicateProjectAssignmentExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(DuplicateProjectAssignmentException.class);

    @ExceptionHandler(DuplicateProjectAssignmentException.class)
    public ResponseEntity<CustomError> handleError(DuplicateProjectAssignmentException exception)
    {
        logger.info(exception.getMessage());
        ResponseEntity<CustomError> responseEntity = new ResponseEntity<CustomError>(exception.getCustomError(), HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }

}

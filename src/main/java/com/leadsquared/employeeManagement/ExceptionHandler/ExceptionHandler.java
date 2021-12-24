package com.leadsquared.employeeManagement.ExceptionHandler;

import com.leadsquared.employeeManagement.Exception.DuplicateProjectAssignmentException;
import com.leadsquared.employeeManagement.Model.CustomError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(Exception.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleError(Exception exception)
    {
        logger.info(exception.getMessage());
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }
}

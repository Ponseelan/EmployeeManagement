package com.employeeManagement.Service;

import com.employeeManagement.Model.Module;
import com.employeeManagement.Repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    @Autowired
    private CounterRepository counterRepository;
    public int getNextValue(Module module)
    {
        return counterRepository.getNextValue(module);
    }
}

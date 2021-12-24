package com.leadsquared.employeeManagement.Service;

import com.leadsquared.employeeManagement.Model.Module;
import com.leadsquared.employeeManagement.Repository.CounterRepository;
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

package com.validation.service;

import com.validation.dao.EmployeeRepository;
import com.validation.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository empRepo;


    @Override
    public Employee addEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return empRepo.findAll();
    }
}

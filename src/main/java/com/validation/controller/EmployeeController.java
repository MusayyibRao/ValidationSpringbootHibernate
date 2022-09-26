package com.validation.controller;

import com.validation.model.Employee;
import com.validation.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl empSer;

@PostMapping("/addEmployee")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee)
{
    Employee empSave= empSer.addEmployee(employee);
    return new ResponseEntity<Employee>(empSave, HttpStatus.CREATED);
}


@GetMapping("/getEmployeeData")
    public List<Employee> getData()
{
    return empSer.getEmployee();
}


}

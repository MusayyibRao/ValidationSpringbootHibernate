package com.validation.model;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.namespace.QName;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long empId;
@NotEmpty(message = "Employee Name cannot be empty")
@Column(name = "employeeName",nullable = false)
@Size(min = 3,message = "please enter fullName")
private String empName;


@Column(name = "employeeSalary",nullable = false)
@NotNull(message = "Salary cannot be empty")
@Range(min = 5000,max=250000,message = "please enter correct salary")
private int  empSalary;

@Pattern(message = "Email is not valid", regexp="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
@NotEmpty(message = "Email cannot be empty")
//@Email
@Column(name = "employeeEmail",nullable = false)
private String empEmail;

@NotEmpty(message = "Phone number  cannot be empty")
//@Size(min = 10,max = 10,message = "Please enter correct mobile number")
@Pattern(regexp="(^$|[0-9]{10})",message = "Please enter correct mobile number")
@Column(name = "employeePhone",nullable = false)
private String empMobile;

    public Employee() {
    }

    public Employee(Long empId, String empName, int empSalary, String empEmail, String empMobile) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empEmail = empEmail;
        this.empMobile = empMobile;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empEmail='" + empEmail + '\'' +
                ", empMobile='" + empMobile + '\'' +
                '}';
    }
}

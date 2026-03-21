package com.klu.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String empname;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "deptid")
    private Department department;

    public int getEmpId() {
        return empid;
    }

    public void setEmpId(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empname;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

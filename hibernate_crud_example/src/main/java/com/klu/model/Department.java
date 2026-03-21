package com.klu.model;

import javax.persistence.*;

@Entity
@Table(name = "department") 
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)                                                      
    
    private int deptid;

    private String deptName;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) { 
       this.deptName = deptName;
    }
}

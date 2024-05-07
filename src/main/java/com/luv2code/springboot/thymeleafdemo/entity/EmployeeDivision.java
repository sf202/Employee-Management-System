// EmployeeDivision.java
package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_division")
@IdClass(EmployeeDivisionId.class)
public class EmployeeDivision {

    @Id
    @Column(name = "empid")
    private int empid;

    @Id
    @Column(name = "div_ID")
    private int divID;

    // Constructors, getters, and setters

    public EmployeeDivision() {
    }

    public EmployeeDivision(int empid, int divID) {
        this.empid = empid;
        this.divID = divID;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getDivID() {
        return divID;
    }

    public void setDivID(int divID) {
        this.divID = divID;
    }
}
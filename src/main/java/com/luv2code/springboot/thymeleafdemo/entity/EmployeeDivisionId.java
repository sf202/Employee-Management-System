// EmployeeDivisionId.java
package com.luv2code.springboot.thymeleafdemo.entity;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDivisionId implements Serializable {

    private int empid;
    private int divID;

    public EmployeeDivisionId() {
    }

    public EmployeeDivisionId(int empid, int divID) {
        this.empid = empid;
        this.divID = divID;
    }

    // Getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDivisionId that = (EmployeeDivisionId) o;
        return empid == that.empid && divID == that.divID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, divID);
    }
}
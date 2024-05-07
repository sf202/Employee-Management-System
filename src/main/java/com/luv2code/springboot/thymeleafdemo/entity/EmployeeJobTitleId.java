package com.luv2code.springboot.thymeleafdemo.entity;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeJobTitleId implements Serializable {

    private int empid;
    private int jobTitleId;

    public EmployeeJobTitleId() {
    }

    public EmployeeJobTitleId(int empid, int jobTitleId) {
        this.empid = empid;
        this.jobTitleId = jobTitleId;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getJobTitleId() {
        return jobTitleId;
    }

    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeJobTitleId that = (EmployeeJobTitleId) o;
        return empid == that.empid && jobTitleId == that.jobTitleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, jobTitleId);
    }
}

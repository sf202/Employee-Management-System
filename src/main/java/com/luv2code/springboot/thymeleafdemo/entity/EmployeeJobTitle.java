// EmployeeJobTitle.java
package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_job_titles")
@IdClass(EmployeeJobTitleId.class)
public class EmployeeJobTitle {

    @Id
    @Column(name = "empid")
    private int empid;

    @Id
    @Column(name = "job_title_id")
    private int jobTitleId;

    // Constructors, getters, and setters

    public EmployeeJobTitle() {
    }

    public EmployeeJobTitle(int empid, int jobTitleId) {
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
}
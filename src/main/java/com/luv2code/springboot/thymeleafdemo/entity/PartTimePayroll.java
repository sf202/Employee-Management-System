package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "part_time_payroll")
public class PartTimePayroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payrollID")
    private int payrollID;

    @Column(name = "empid")
    private int empid;

    @Column(name = "pay_date")
    private Date payDate;

    @Column(name = "hours_worked")
    private double hoursWorked;

    @Column(name = "hourly_wage")
    private double hourlyWage;

    @Column(name = "earnings")
    private double earnings;

    @Column(name = "fed_tax")
    private double fedTax;

    @Column(name = "fed_med")
    private double fedMed;

    @Column(name = "fed_SS")
    private double fedSS;

    @Column(name = "state_tax")
    private double stateTax;

    // Constructors, getters, and setters

    public PartTimePayroll() {
    }

    public PartTimePayroll(int payrollID, int empid, Date payDate, double hoursWorked, double hourlyWage, double earnings, double fedTax, double fedMed, double fedSS, double stateTax) {
        this.payrollID = payrollID;
        this.empid = empid;
        this.payDate = payDate;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        this.earnings = earnings;
        this.fedTax = fedTax;
        this.fedMed = fedMed;
        this.fedSS = fedSS;
        this.stateTax = stateTax;
    }

    public int getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(int payrollID) {
        this.payrollID = payrollID;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public double getFedMed() {
        return fedMed;
    }

    public void setFedMed(double fedMed) {
        this.fedMed = fedMed;
    }

    public double getFedSS() {
        return fedSS;
    }

    public void setFedSS(double fedSS) {
        this.fedSS = fedSS;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }
}
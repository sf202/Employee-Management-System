package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payid")
    private int payid;

    @Column(name = "pay_date")
    private Date payDate;

    @Column(name = "earnings")
    private double earnings;

    @Column(name = "fed_tax")
    private double fedTax;

    @Column(name = "fed_med")
    private double fedMed;

    @Column(name = "fed_ss")
    private double fedSS;

    @Column(name = "state_tax")
    private double stateTax;

    @Column(name = "retire_401k")
    private double retire401k;

    @Column(name = "health_cost")
    private double healthCost;

    @Column(name = "empid")
    private int empid;

    // Constructors

    public Payroll() {
    }

    public Payroll(Date payDate, double earnings, double fedTax, double fedMed, double fedSS, double stateTax, double retire401k, double healthCost, int empid) {
        this.payDate = payDate;
        this.earnings = earnings;
        this.fedTax = fedTax;
        this.fedMed = fedMed;
        this.fedSS = fedSS;
        this.stateTax = stateTax;
        this.retire401k = retire401k;
        this.healthCost = healthCost;
        this.empid = empid;
    }

    // Getters and Setters

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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

    public double getRetire401k() {
        return retire401k;
    }

    public void setRetire401k(double retire401k) {
        this.retire401k = retire401k;
    }

    public double getHealthCost() {
        return healthCost;
    }

    public void setHealthCost(double healthCost) {
        this.healthCost = healthCost;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

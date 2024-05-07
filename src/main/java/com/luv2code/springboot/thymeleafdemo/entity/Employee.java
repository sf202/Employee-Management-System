package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate; // Use java.time.LocalDate
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee")
public class Employee {

    // Define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "hire_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) // Use the ISO date format
    private LocalDate hireDate; // Change the type to LocalDate

    @Column(name = "salary")
    private BigDecimal salary;

    // Define constructors
    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, String ssn, LocalDate hireDate, BigDecimal salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String email, String ssn, LocalDate hireDate, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    // Define getter/setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }
}
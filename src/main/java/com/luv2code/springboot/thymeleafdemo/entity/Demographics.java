// Demographics.java
package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "demographics")
public class Demographics {
    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "phone")
    private String phone;

    @Column(name = "gender")
    private String gender;

    @Column(name = "pronouns")
    private String pronouns;

    @Column(name = "identified_race")
    private String identifiedRace;

    @Column(name = "DOB")
    private Date dateOfBirth;

    @Column(name = "SSN")
    private String ssn;

    // Constructors, getters, and setters
    // ...

    public Demographics() {
    }

    public Demographics(int empid, String phone, String gender, String pronouns, String identifiedRace, Date dateOfBirth, String ssn) {
        this.empid = empid;
        this.phone = phone;
        this.gender = gender;
        this.pronouns = pronouns;
        this.identifiedRace = identifiedRace;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
    }

    // Getters and Setters
    
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public String getIdentifiedRace() {
        return identifiedRace;
    }

    public void setIdentifiedRace(String identifiedRace) {
        this.identifiedRace = identifiedRace;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "Demographics{" +
                "empid=" + empid +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", pronouns='" + pronouns + '\'' +
                ", identifiedRace='" + identifiedRace + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
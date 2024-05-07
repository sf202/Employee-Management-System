package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "addressline1") // Update this column name
    private String addressLine1;

    @Column(name = "addressline2") // Update this column name
    private String addressLine2;

    @Column(name = "cityid") // Update this column name
    private int cityID;

    @Column(name = "stateid") // Update this column name
    private int stateID;

    @Column(name = "country")
    private String country;

    @Column(name = "postalcode") // Update this column name
    private String postalCode;

    // Getters, setters, and constructors
    // ...

      public Address() {
    }

    public Address(int empid, String addressLine1, String addressLine2, int cityID, int stateID, String country, String postalCode) {
        this.empid = empid;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.cityID = cityID;
        this.stateID = stateID;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Getters and Setters
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "Address{" +
                "empid=" + empid +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", cityID=" + cityID +
                ", stateID=" + stateID +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }


}

package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> findAll();

    Address findById(int empid);

    void save(Address address);

    void deleteById(int empid);
}

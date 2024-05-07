package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;

import java.util.List;

public interface DemographicsService {

    List<Demographics> findAll();

    Demographics findById(int empid);

    void save(Demographics demographics);

    void deleteById(int empid);

    List<Demographics> findByNameOrSsn(String searchTerm);
}
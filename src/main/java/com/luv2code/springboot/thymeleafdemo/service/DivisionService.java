package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Division;

import java.util.List;

public interface DivisionService {
    List<Division> findAll();
    Division findById(int id);
    void save(Division division);
    void deleteById(int id);
}
// EmployeeDivisionService.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivision;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivisionId;

import java.util.List;

public interface EmployeeDivisionService {
    List<EmployeeDivision> findAll();
    EmployeeDivision findById(EmployeeDivisionId id);
    void save(EmployeeDivision employeeDivision);
    void deleteById(EmployeeDivisionId id);
}
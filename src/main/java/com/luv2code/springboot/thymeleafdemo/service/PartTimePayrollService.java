package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.PartTimePayroll;

import java.util.List;

public interface PartTimePayrollService {
    List<PartTimePayroll> findAll();

    PartTimePayroll findById(int payrollID);

    void save(PartTimePayroll partTimePayroll);

    void deleteById(int payrollID);
}
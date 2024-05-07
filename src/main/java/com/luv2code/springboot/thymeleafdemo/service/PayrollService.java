// PayrollService.java
package com.luv2code.springboot.thymeleafdemo.service;
import com.luv2code.springboot.thymeleafdemo.entity.Payroll;


import java.util.List;

public interface PayrollService {

    List<Payroll> findAll();

    Payroll findById(int payid);

    void save(Payroll payroll);

    void deleteById(int payid);
}
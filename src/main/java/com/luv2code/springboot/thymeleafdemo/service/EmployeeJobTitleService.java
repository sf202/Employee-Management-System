// EmployeeJobTitleService.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitle;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitleId;

import java.util.List;

public interface EmployeeJobTitleService {
    List<EmployeeJobTitle> findAll();
    EmployeeJobTitle findById(EmployeeJobTitleId id);
    void save(EmployeeJobTitle employeeJobTitle);
    void deleteById(EmployeeJobTitleId id);
}
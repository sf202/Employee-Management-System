// EmployeeJobTitleServiceImpl.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitle;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitleId;
import com.luv2code.springboot.thymeleafdemo.repository.EmployeeJobTitleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeJobTitleServiceImpl implements EmployeeJobTitleService {

    private final EmployeeJobTitleRepository employeeJobTitleRepository;

    public EmployeeJobTitleServiceImpl(EmployeeJobTitleRepository employeeJobTitleRepository) {
        this.employeeJobTitleRepository = employeeJobTitleRepository;
    }

    @Override
    @Transactional
    public List<EmployeeJobTitle> findAll() {
        return employeeJobTitleRepository.findAll();
    }

    @Override
    @Transactional
    public EmployeeJobTitle findById(EmployeeJobTitleId id) {
        Optional<EmployeeJobTitle> result = employeeJobTitleRepository.findById(id);
        EmployeeJobTitle employeeJobTitle;
        if (result.isPresent()) {
            employeeJobTitle = result.get();
        } else {
            throw new RuntimeException("Employee Job Title not found for id: " + id);
        }
        return employeeJobTitle;
    }

    @Override
    @Transactional
    public void save(EmployeeJobTitle employeeJobTitle) {
        employeeJobTitleRepository.save(employeeJobTitle);
    }

    @Override
    @Transactional
    public void deleteById(EmployeeJobTitleId id) {
        employeeJobTitleRepository.deleteById(id);
    }
}
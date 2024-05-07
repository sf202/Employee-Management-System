// EmployeeDivisionServiceImpl.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivision;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivisionId;
import com.luv2code.springboot.thymeleafdemo.repository.EmployeeDivisionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDivisionServiceImpl implements EmployeeDivisionService {

    private final EmployeeDivisionRepository employeeDivisionRepository;

    public EmployeeDivisionServiceImpl(EmployeeDivisionRepository employeeDivisionRepository) {
        this.employeeDivisionRepository = employeeDivisionRepository;
    }

    @Override
    @Transactional
    public List<EmployeeDivision> findAll() {
        return employeeDivisionRepository.findAll();
    }

    @Override
    @Transactional
    public EmployeeDivision findById(EmployeeDivisionId id) {
        Optional<EmployeeDivision> result = employeeDivisionRepository.findById(id);
        EmployeeDivision employeeDivision;
        if (result.isPresent()) {
            employeeDivision = result.get();
        } else {
            throw new RuntimeException("Employee Division not found for id: " + id);
        }
        return employeeDivision;
    }

    @Override
    @Transactional
    public void save(EmployeeDivision employeeDivision) {
        employeeDivisionRepository.save(employeeDivision);
    }

    @Override
    @Transactional
    public void deleteById(EmployeeDivisionId id) {
        employeeDivisionRepository.deleteById(id);
    }
}
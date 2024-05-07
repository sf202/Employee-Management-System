package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.PartTimePayroll;
import com.luv2code.springboot.thymeleafdemo.repository.PartTimePayrollRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PartTimePayrollServiceImpl implements PartTimePayrollService {

    private final PartTimePayrollRepository partTimePayrollRepository;

    public PartTimePayrollServiceImpl(PartTimePayrollRepository partTimePayrollRepository) {
        this.partTimePayrollRepository = partTimePayrollRepository;
    }

    @Override
    @Transactional
    public List<PartTimePayroll> findAll() {
        return partTimePayrollRepository.findAll();
    }

    @Override
    @Transactional
    public PartTimePayroll findById(int payrollID) {
        Optional<PartTimePayroll> result = partTimePayrollRepository.findById(payrollID);
        PartTimePayroll partTimePayroll;
        if (result.isPresent()) {
            partTimePayroll = result.get();
        } else {
            throw new RuntimeException("PartTimePayroll not found for payrollID: " + payrollID);
        }
        return partTimePayroll;
    }

    @Override
    @Transactional
    public void save(PartTimePayroll partTimePayroll) {
        partTimePayrollRepository.save(partTimePayroll);
    }

    @Override
    @Transactional
    public void deleteById(int payrollID) {
        partTimePayrollRepository.deleteById(payrollID);
    }
}
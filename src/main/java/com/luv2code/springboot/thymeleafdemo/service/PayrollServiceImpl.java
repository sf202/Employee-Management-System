// PayrollServiceImpl.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Payroll;
import com.luv2code.springboot.thymeleafdemo.repository.PayrollRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollServiceImpl implements PayrollService {

    private final PayrollRepository payrollRepository;

    public PayrollServiceImpl(PayrollRepository payrollRepository) {
        this.payrollRepository = payrollRepository;
    }

    @Override
    @Transactional
    public List<Payroll> findAll() {
        return payrollRepository.findAll();
    }

    @Override
    @Transactional
    public Payroll findById(int payid) {
        Optional<Payroll> result = payrollRepository.findById(payid);
        Payroll payroll;
        if (result.isPresent()) {
            payroll = result.get();
        } else {
            throw new RuntimeException("Payroll not found for payid: " + payid);
        }
        return payroll;
    }

    @Override
    @Transactional
    public void save(Payroll payroll) {
        payrollRepository.save(payroll);
    }

    @Override
    @Transactional
    public void deleteById(int payid) {
        payrollRepository.deleteById(payid);
    }
}
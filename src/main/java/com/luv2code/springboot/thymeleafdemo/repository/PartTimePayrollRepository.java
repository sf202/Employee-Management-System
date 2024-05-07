package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.entity.PartTimePayroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartTimePayrollRepository extends JpaRepository<PartTimePayroll, Integer> {
    // You can add custom query methods here if needed
}
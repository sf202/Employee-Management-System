// EmployeeDivisionRepository.java
package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivision;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivisionId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDivisionRepository extends JpaRepository<EmployeeDivision, EmployeeDivisionId> {
}
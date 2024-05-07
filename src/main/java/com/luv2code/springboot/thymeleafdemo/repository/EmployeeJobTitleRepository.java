// EmployeeJobTitleRepository.java
package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitle;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitleId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJobTitleRepository extends JpaRepository<EmployeeJobTitle, EmployeeJobTitleId> {
}
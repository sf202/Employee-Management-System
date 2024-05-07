// JobTitleService.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> findAll();
    JobTitle findById(int id);
    void save(JobTitle jobTitle);
    void deleteById(int id);
}
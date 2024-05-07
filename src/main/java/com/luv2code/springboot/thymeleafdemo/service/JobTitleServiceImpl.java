// JobTitleServiceImpl.java
package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.JobTitle;
import com.luv2code.springboot.thymeleafdemo.repository.JobTitleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleServiceImpl implements JobTitleService {

    private final JobTitleRepository jobTitleRepository;

    public JobTitleServiceImpl(JobTitleRepository jobTitleRepository) {
        this.jobTitleRepository = jobTitleRepository;
    }

    @Override
    @Transactional
    public List<JobTitle> findAll() {
        return jobTitleRepository.findAll();
    }

    @Override
    @Transactional
    public JobTitle findById(int id) {
        Optional<JobTitle> result = jobTitleRepository.findById(id);
        JobTitle jobTitle;
        if (result.isPresent()) {
            jobTitle = result.get();
        } else {
            throw new RuntimeException("Job Title not found for id: " + id);
        }
        return jobTitle;
    }

    @Override
    @Transactional
    public void save(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        jobTitleRepository.deleteById(id);
    }
}
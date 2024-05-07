package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;
import com.luv2code.springboot.thymeleafdemo.repository.DemographicsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DemographicsServiceImpl implements DemographicsService {

    private final DemographicsRepository demographicsRepository;

    public DemographicsServiceImpl(DemographicsRepository demographicsRepository) {
        this.demographicsRepository = demographicsRepository;
    }

    @Override
    @Transactional
    public List<Demographics> findAll() {
        return demographicsRepository.findAll();
    }

    @Override
    @Transactional
    public Demographics findById(int empid) {
        Optional<Demographics> result = demographicsRepository.findById(empid);
        return result.orElse(null);
    }

    @Override
    @Transactional
    public void save(Demographics demographics) {
        demographicsRepository.save(demographics);
    }

    @Override
    @Transactional
    public void deleteById(int empid) {
        demographicsRepository.deleteById(empid);
    }

    @Override
    public List<Demographics> findByNameOrSsn(String searchTerm) {
        List<Demographics> demographics = new ArrayList<>();

        if (isNumeric(searchTerm)) {
            // If the search term is a valid integer, treat it as an employee ID
            int empid = Integer.parseInt(searchTerm);
            Demographics demo = findById(empid);
            if (demo != null) {
                demographics.add(demo);
            }
        } else {
            // If the search term is not a valid integer, search by name or SSN
            demographics.addAll(demographicsRepository.findByPronounsContainingIgnoreCase(searchTerm));
            demographics.addAll(demographicsRepository.findBySsnContainingIgnoreCase(searchTerm));
        }

        return demographics;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
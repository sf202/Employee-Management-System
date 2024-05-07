package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Division;
import com.luv2code.springboot.thymeleafdemo.repository.DivisionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionServiceImpl implements DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionServiceImpl(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Override
    @Transactional
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    @Transactional
    public Division findById(int id) {
        Optional<Division> result = divisionRepository.findById(id);
        Division division;
        if (result.isPresent()) {
            division = result.get();
        } else {
            throw new RuntimeException("Division not found for id: " + id);
        }
        return division;
    }

    @Override
    @Transactional
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        divisionRepository.deleteById(id);
    }
}
package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;

import java.util.List;

import org.springframework.data.jpa .repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemographicsRepository extends JpaRepository<Demographics, Integer> {
    // You can add custom query methods here if needed
    List<Demographics> findByPronounsContainingIgnoreCase(String pronouns);

    List<Demographics> findBySsnContainingIgnoreCase(String ssn);
}
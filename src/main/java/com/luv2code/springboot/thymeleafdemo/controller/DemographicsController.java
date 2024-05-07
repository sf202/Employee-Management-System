package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Demographics;
import com.luv2code.springboot.thymeleafdemo.service.DemographicsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/demographics")
public class DemographicsController {

    private final DemographicsService demographicsService;

    public DemographicsController(DemographicsService demographicsService) {
        this.demographicsService = demographicsService;
    }

    @GetMapping("/list")
    public String listDemographics(Model model) {
        List<Demographics> demographics = demographicsService.findAll();
        model.addAttribute("demographics", demographics);
        return "demographics/list-demographics";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Demographics demographics = new Demographics();
        model.addAttribute("demographics", demographics);
        return "demographics/demographics-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("empid") int empid, Model model) {
        Demographics demographics = demographicsService.findById(empid);
        model.addAttribute("demographics", demographics);
        return "demographics/demographics-form";
    }

    @PostMapping("/save")
    public String saveDemographics(@ModelAttribute("demographics") Demographics demographics) {
        demographicsService.save(demographics);
        return "redirect:/demographics/list";
    }

    @GetMapping("/delete")
    public String deleteDemographics(@RequestParam("empid") int empid) {
        demographicsService.deleteById(empid);
        return "redirect:/demographics/list";
    }

    @GetMapping("/search")
    public String searchDemographics(@RequestParam(required = false) String searchTerm, Model model) {
        List<Demographics> demographics = demographicsService.findByNameOrSsn(searchTerm);
        model.addAttribute("demographics", demographics);
        return "demographics/list-demographics";
    }
}
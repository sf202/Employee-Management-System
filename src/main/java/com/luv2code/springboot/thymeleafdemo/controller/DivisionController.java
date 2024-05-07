package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Division;
import com.luv2code.springboot.thymeleafdemo.service.DivisionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/divisions")
public class DivisionController {

    private final DivisionService divisionService;

    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping("/list")
    public String listDivisions(Model model) {
        List<Division> divisions = divisionService.findAll();
        model.addAttribute("divisions", divisions);
        return "divisions/list-divisions";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Division division = new Division();
        model.addAttribute("division", division);
        return "divisions/division-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("divisionId") int divisionId, Model model) {
        Division division = divisionService.findById(divisionId);
        model.addAttribute("division", division);
        return "divisions/division-form";
    }

    @PostMapping("/save")
    public String saveDivision(@ModelAttribute("division") Division division) {
        divisionService.save(division);
        return "redirect:/divisions/list";
    }

    @GetMapping("/delete")
    public String deleteDivision(@RequestParam("divisionId") int divisionId) {
        divisionService.deleteById(divisionId);
        return "redirect:/divisions/list";
    }
}
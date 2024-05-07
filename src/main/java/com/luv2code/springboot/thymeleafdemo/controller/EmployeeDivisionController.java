// EmployeeDivisionController.java
package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivision;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeDivisionId;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeDivisionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employeeDivisions")
public class EmployeeDivisionController {

    private final EmployeeDivisionService employeeDivisionService;

    public EmployeeDivisionController(EmployeeDivisionService employeeDivisionService) {
        this.employeeDivisionService = employeeDivisionService;
    }

    @GetMapping("/list")
    public String listEmployeeDivisions(Model model) {
        List<EmployeeDivision> employeeDivisions = employeeDivisionService.findAll();
        model.addAttribute("employeeDivisions", employeeDivisions);
        return "employee-divisions/list-employee-divisions";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        EmployeeDivision employeeDivision = new EmployeeDivision();
        model.addAttribute("employeeDivision", employeeDivision);
        return "employee-divisions/employee-division-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("empid") int empid, @RequestParam("divID") int divID, Model model) {
        EmployeeDivisionId id = new EmployeeDivisionId(empid, divID);
        EmployeeDivision employeeDivision = employeeDivisionService.findById(id);
        model.addAttribute("employeeDivision", employeeDivision);
        return "employee-divisions/employee-division-form";
    }

    @PostMapping("/save")
    public String saveEmployeeDivision(@ModelAttribute("employeeDivision") EmployeeDivision employeeDivision) {
        employeeDivisionService.save(employeeDivision);
        return "redirect:/employeeDivisions/list";
    }

    @GetMapping("/delete")
    public String deleteEmployeeDivision(@RequestParam("empid") int empid, @RequestParam("divID") int divID) {
        EmployeeDivisionId id = new EmployeeDivisionId(empid, divID);
        employeeDivisionService.deleteById(id);
        return "redirect:/employeeDivisions/list";
    }
}
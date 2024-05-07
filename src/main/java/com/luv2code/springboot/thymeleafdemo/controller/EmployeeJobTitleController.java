// EmployeeJobTitleController.java
package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitle;
import com.luv2code.springboot.thymeleafdemo.entity.EmployeeJobTitleId;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeJobTitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employeeJobTitles")
public class EmployeeJobTitleController {

    private final EmployeeJobTitleService employeeJobTitleService;

    public EmployeeJobTitleController(EmployeeJobTitleService employeeJobTitleService) {
        this.employeeJobTitleService = employeeJobTitleService;
    }

    @GetMapping("/list")
    public String listEmployeeJobTitles(Model model) {
        List<EmployeeJobTitle> employeeJobTitles = employeeJobTitleService.findAll();
        model.addAttribute("employeeJobTitles", employeeJobTitles);
        return "employee-job-titles/list-employee-job-titles";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        EmployeeJobTitle employeeJobTitle = new EmployeeJobTitle();
        model.addAttribute("employeeJobTitle", employeeJobTitle);
        return "employee-job-titles/employee-job-title-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("empid") int empid, @RequestParam("jobTitleId") int jobTitleId, Model model) {
        EmployeeJobTitleId id = new EmployeeJobTitleId(empid, jobTitleId);
        EmployeeJobTitle employeeJobTitle = employeeJobTitleService.findById(id);
        model.addAttribute("employeeJobTitle", employeeJobTitle);
        return "employee-job-titles/employee-job-title-form";
    }

    @PostMapping("/save")
    public String saveEmployeeJobTitle(@ModelAttribute("employeeJobTitle") EmployeeJobTitle employeeJobTitle) {
        employeeJobTitleService.save(employeeJobTitle);
        return "redirect:/employeeJobTitles/list";
    }

    @GetMapping("/delete")
    public String deleteEmployeeJobTitle(@RequestParam("empid") int empid, @RequestParam("jobTitleId") int jobTitleId) {
        EmployeeJobTitleId id = new EmployeeJobTitleId(empid, jobTitleId);
        employeeJobTitleService.deleteById(id);
        return "redirect:/employeeJobTitles/list";
    }
}
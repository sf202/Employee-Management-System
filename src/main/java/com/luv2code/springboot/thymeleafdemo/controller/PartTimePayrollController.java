package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.PartTimePayroll;
import com.luv2code.springboot.thymeleafdemo.service.PartTimePayrollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/part-time-payroll")
public class PartTimePayrollController {

    private final PartTimePayrollService partTimePayrollService;

    public PartTimePayrollController(PartTimePayrollService partTimePayrollService) {
        this.partTimePayrollService = partTimePayrollService;
    }

    @GetMapping("/list")
    public String listPartTimePayroll(Model model) {
        List<PartTimePayroll> partTimePayrolls = partTimePayrollService.findAll();
        model.addAttribute("partTimePayrolls", partTimePayrolls);
        return "part-time-payroll/list-part-time-payroll";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        PartTimePayroll partTimePayroll = new PartTimePayroll();
        model.addAttribute("partTimePayroll", partTimePayroll);
        return "part-time-payroll/part-time-payroll-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("payrollID") int payrollID, Model model) {
        PartTimePayroll partTimePayroll = partTimePayrollService.findById(payrollID);
        model.addAttribute("partTimePayroll", partTimePayroll);
        return "part-time-payroll/part-time-payroll-form";
    }

    @PostMapping("/save")
    public String savePartTimePayroll(@ModelAttribute("partTimePayroll") PartTimePayroll partTimePayroll) {
        partTimePayrollService.save(partTimePayroll);
        return "redirect:/part-time-payroll/list";
    }

    @GetMapping("/delete")
    public String deletePartTimePayroll(@RequestParam("payrollID") int payrollID) {
        partTimePayrollService.deleteById(payrollID);
        return "redirect:/part-time-payroll/list";
    }
}
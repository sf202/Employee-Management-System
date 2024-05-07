// PayrollController.java
package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Payroll;
import com.luv2code.springboot.thymeleafdemo.service.PayrollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/payrolls")
public class PayrollController {

    private final PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @GetMapping("/list")
    public String listPayrolls(Model model) {
        List<Payroll> payrolls = payrollService.findAll();
        model.addAttribute("payrolls", payrolls);
        return "payrolls/list-payrolls";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Payroll payroll = new Payroll();
        model.addAttribute("payroll", payroll);
        return "payrolls/payroll-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("payid") int payid, Model model) {
        Payroll payroll = payrollService.findById(payid);
        model.addAttribute("payroll", payroll);
        return "payrolls/payroll-form";
    }

    @PostMapping("/save")
    public String savePayroll(@ModelAttribute("payroll") Payroll payroll) {
        payrollService.save(payroll);
        return "redirect:/payrolls/list";
    }

    @GetMapping("/delete")
    public String deletePayroll(@RequestParam("payid") int payid) {
        payrollService.deleteById(payid);
        return "redirect:/payrolls/list";
    }
}
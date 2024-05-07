// JobTitleController.java
package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.JobTitle;
import com.luv2code.springboot.thymeleafdemo.service.JobTitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/job-titles")
public class JobTitleController {

    private final JobTitleService jobTitleService;

    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/list")
    public String listJobTitles(Model model) {
        List<JobTitle> jobTitles = jobTitleService.findAll();
        model.addAttribute("jobTitles", jobTitles);
        return "job-titles/list-job-titles"; // Correct path
    }
    
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        JobTitle jobTitle = new JobTitle();
        model.addAttribute("jobTitle", jobTitle);
        return "job-titles/job-title-form"; // Correct path
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") int id, Model model) {
        JobTitle jobTitle = jobTitleService.findById(id);
        model.addAttribute("jobTitle", jobTitle);
        return "job-titles/job-title-form"; // Correct path
    }
    

    @PostMapping("/save")
    public String saveJobTitle(@ModelAttribute("jobTitle") JobTitle jobTitle) {
        jobTitleService.save(jobTitle);
        return "redirect:/job-titles/list";
    }
    

    @GetMapping("/delete")
    public String deleteJobTitle(@RequestParam("id") int id) {
        jobTitleService.deleteById(id);
        return "redirect:/job-titles/list";
    }
}
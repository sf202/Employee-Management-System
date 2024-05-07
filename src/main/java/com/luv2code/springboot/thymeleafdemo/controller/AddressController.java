// AddressController.java
package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/list")
    public String listAddresses(Model model) {
        List<Address> addresses = addressService.findAll();
        model.addAttribute("addresses", addresses);
        return "addresses/list-addresses";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Address address = new Address();
        model.addAttribute("address", address);
        return "addresses/address-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("empid") int empid, Model model) {
        Address address = addressService.findById(empid);
        model.addAttribute("address", address);
        return "addresses/address-form";
    }

    @PostMapping("/save")
    public String saveAddress(@ModelAttribute("address") Address address) {
        addressService.save(address);
        return "redirect:/addresses/list";
    }

    @GetMapping("/delete")
    public String deleteAddress(@RequestParam("empid") int empid) {
        addressService.deleteById(empid);
        return "redirect:/addresses/list";
    }
}

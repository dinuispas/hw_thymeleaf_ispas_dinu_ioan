package com.tcv.spring8api.controller;


import com.tcv.spring8api.model.Customer;
import com.tcv.spring8api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerViewController {

    private final CustomerService customerService;

    @GetMapping("customers")
    public String getCustomers(Model model){
        model.addAttribute("customers",customerService.getCustomers());
        return "customers";
    }

    @GetMapping("customers/ordered")
    public String getAllCustomers(Model model){
        model.addAttribute("allCustomers",customerService.findCustomers());
        return "customers";
    }

    @GetMapping("customers/{id}")
    public String getCustomerById(Model model, @PathVariable("id") Integer id){
        model.addAttribute("getById",customerService.getCustomerById(id));
        return "customers";
    }

//    @GetMapping("customers/{username}/{name}")
//    public String myOrdered(Model model, @PathVariable("username") String username,
//                            @PathVariable("name") String name) {
//        model.addAttribute("myList",customerService.orderCustomers(username, name));
//        return "customers";
//    }





}

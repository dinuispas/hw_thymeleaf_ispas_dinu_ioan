package com.tcv.spring8api.controller;


import com.tcv.spring8api.model.Customer;
import com.tcv.spring8api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping("ordered")
    public List<Customer> getAllCustomer(){
        return customerService.findCustomers();
    }

//    @GetMapping("/{username}/{name}")
//    public List<Customer> getOrderedCustomers(@PathVariable("username") String username,
//                                              @PathVariable("name") String name){
//        return customerService.orderCustomers(username,name);
//    }


    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){

        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Integer id) {

        return customerService.getCustomerById(id);
    }





}
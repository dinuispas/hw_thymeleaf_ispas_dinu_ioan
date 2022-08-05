package com.tcv.spring8api.service;


import com.tcv.spring8api.model.Customer;
import com.tcv.spring8api.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.tcv.spring8api.model.Customer.SORT_BY_CREATED_AT_DESC;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }

//    public List<Customer> orderCustomers(String username,String name){
//        return customerRepository.findByUsernameAndNameOrderByCityAsc(username,name);
//    }

    public Customer saveCustomer(Customer customer){

        return customerRepository.save(customer);
    }

    public Customer getProductById(Integer id) {

        return customerRepository.findById(id).get();
    }

    public Customer getCustomerById(Integer id) {

        return customerRepository.findById(id).get();
    }

    public List<Customer> findCustomers() {
        return this.customerRepository.findAll(SORT_BY_CREATED_AT_DESC);
    }





}

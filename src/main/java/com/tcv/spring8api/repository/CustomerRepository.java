package com.tcv.spring8api.repository;

import com.tcv.spring8api.model.Customer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAll();
    Customer findCustomerById(Integer id);
//    List<Customer> findByUsernameAndNameOrderByCityAsc(String username, String name);
    List<Customer> findAll(Sort sort);
}
package com.jumia.demo.services;

import com.jumia.demo.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {

    public List<Customer> getCustomerList();
}

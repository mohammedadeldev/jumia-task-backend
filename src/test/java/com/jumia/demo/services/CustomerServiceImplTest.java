package com.jumia.demo.services;

import com.jumia.demo.entities.Customer;
import com.jumia.demo.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    @Spy
    private CustomerServiceImpl customerServiceImpl;

    @Test
    public void test_getCustomerList(){
        List<Customer> customers = Arrays.asList(Mockito.mock(Customer.class));
        Mockito.when(customerRepository.findAll()).thenReturn(customers);
        List<Customer> result = customerServiceImpl.getCustomerList();
        assertEquals(1,result.size());
    }

}
package com.jumia.demo.repositories;

import com.jumia.demo.entities.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testFindAll_thenReturnCustomers(){
        Customer customer = new Customer();
        customer.setPhone("(212) 698054317");
        customer.setName("Mohammad Adel");

        entityManager.persist(customer);
        entityManager.flush();

        List<Customer> customers = customerRepository.findAll();
        assertFalse(customers.isEmpty());
    }
}
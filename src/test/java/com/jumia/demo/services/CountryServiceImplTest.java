package com.jumia.demo.services;

import com.jumia.demo.constants.Constants;
import com.jumia.demo.dto.CountryDTO;
import com.jumia.demo.entities.Customer;
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
public class CountryServiceImplTest {

    @Mock
    private CustomerServiceImpl customerServiceImpl;

    @InjectMocks
    @Spy
    private CountryServiceImpl countryServiceImpl;

    @Test
    public void test_getAllCountries_CameroonValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(237) 697151594");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.CAMEROON_COUNTRY_CODE) && result.get(0).getState().equals(Constants.VALID));
    }

    @Test
    public void test_getAllCountries_Cameroon_NotValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(237) 6971515945A");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.CAMEROON_COUNTRY_CODE) && result.get(0).getState().equals(Constants.ERROR));
    }

    @Test
    public void test_getAllCountries_Ethiopia_ValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(251) 914701723");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.ETHIOPIA_COUNTRY_CODE) && result.get(0).getState().equals(Constants.VALID));
    }

    @Test
    public void test_getAllCountries_Ethiopia_NotValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(251) 914701723A");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.ETHIOPIA_COUNTRY_CODE) && result.get(0).getState().equals(Constants.ERROR));
    }

    @Test
    public void test_getAllCountries_Morocco_ValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(212) 691933626");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.MOROCCO_COUNTRY_CODE) && result.get(0).getState().equals(Constants.VALID));
    }

    @Test
    public void test_getAllCountries_Morocco_NotValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(212) 691933626A");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.MOROCCO_COUNTRY_CODE) && result.get(0).getState().equals(Constants.ERROR));
    }

    @Test
    public void test_getAllCountries_Mozambique_ValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(258) 847651504");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.MOZAMBIQUE_COUNTRY_CODE) && result.get(0).getState().equals(Constants.VALID));
    }

    @Test
    public void test_getAllCountries_Mozambique_NotValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(258) 847651504A");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.MOZAMBIQUE_COUNTRY_CODE) && result.get(0).getState().equals(Constants.ERROR));
    }

    @Test
    public void test_getAllCountries_Uganda_ValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(256) 775069443");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.UGANDA_COUNTRY_CODE) && result.get(0).getState().equals(Constants.VALID));
    }

    @Test
    public void test_getAllCountries_Uganda_NotValidNumbers(){
        Customer customer = new Customer();
        customer.setPhone("(256) 775069443A");
        List<Customer> customers = Arrays.asList(customer);
        Mockito.when(customerServiceImpl.getCustomerList()).thenReturn(customers);
        List<CountryDTO> result = countryServiceImpl.getAllCountries();
        assertTrue(result.get(0).getPhone().contains(Constants.UGANDA_COUNTRY_CODE) && result.get(0).getState().equals(Constants.ERROR));
    }

}
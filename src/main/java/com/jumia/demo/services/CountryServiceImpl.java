package com.jumia.demo.services;

import com.jumia.demo.dto.CountryDTO;
import com.jumia.demo.entities.Customer;
import com.jumia.demo.utils.CountryUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.jumia.demo.constants.Constants.*;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private ICustomerService customerServiceImpl;

    @Override
    public List<CountryDTO> getAllCountries() {
        // fetch customers data from database
        List<Customer> customers = customerServiceImpl.getCustomerList();

        //initializing countries list with
        List<CountryDTO> countries = new ArrayList<>();

        // looping customers data list
        for (Customer c : customers) {

            // extracting country code to match with the corresponding country
            String code = c.getPhone().substring(0,5);

            // matching country code with it's corresponding country
            switch (code) {
                case CAMEROON_COUNTRY_CODE:
                    // creating cameroon country dto with it's details and adding it to countries list
                    CountryUtil.createAndAddCountryDTO(CAMEROON_REGEX,CAMEROON,CAMEROON_COUNTRY_CODE_PLUS,c.getPhone(),countries);
                    break;
                case ETHIOPIA_COUNTRY_CODE:
                    // creating ethiopia country dto with it's details and adding it to countries list
                    CountryUtil.createAndAddCountryDTO(ETHIOPIA_REGEX,ETHIOPIA,ETHIOPIA_COUNTRY_CODE_PLUS,c.getPhone(),countries);
                    break;
                case MOROCCO_COUNTRY_CODE:
                    // creating morocco country dto with it's details and adding it to countries list
                    CountryUtil.createAndAddCountryDTO(MOROCCO_REGEX,MOROCCO,MOROCCO_COUNTRY_CODE_PLUS,c.getPhone(),countries);
                    break;
                case MOZAMBIQUE_COUNTRY_CODE:
                    // creating mozambique country dto with it's details and adding it to countries list
                    CountryUtil.createAndAddCountryDTO(MOZAMBIQUE_REGEX,MOZAMBIQUE,MOZAMBIQUE_COUNTRY_CODE_PLUS,c.getPhone(),countries);
                    break;
                case UGANDA_COUNTRY_CODE:
                    // creating uganda country dto with it's details and adding it to countries list
                    CountryUtil.createAndAddCountryDTO(UGANDA_REGEX,UGANDA,UGANDA_COUNTRY_CODE_PLUS,c.getPhone(),countries);
                    break;
                default:
                    break;
            }
        }
        return countries;
    }
}

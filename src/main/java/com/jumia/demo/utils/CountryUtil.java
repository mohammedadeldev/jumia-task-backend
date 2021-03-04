package com.jumia.demo.utils;

import com.jumia.demo.dto.CountryDTO;

import java.util.List;

import static com.jumia.demo.constants.Constants.*;

public class CountryUtil {

    public static void createAndAddCountryDTO(String regex, String country, String countryCode,String phone, List<CountryDTO> dtos) {
        if (phone.matches(regex)) {
            dtos.add(new CountryDTO(country, VALID, countryCode, phone));
        } else {
            dtos.add(new CountryDTO(country, ERROR, countryCode, phone));
        }

    }
}

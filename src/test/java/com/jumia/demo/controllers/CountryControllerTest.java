package com.jumia.demo.controllers;

import com.jumia.demo.dto.CountryDTO;
import com.jumia.demo.services.CountryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(CountryController.class)
public class CountryControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CountryServiceImpl countryServiceImpl;

    @Test
    public void test_getAllCountries_returnCountries() throws Exception {
        CountryDTO countryDTO = new CountryDTO("Morocco","Error","+212","(212) 6007989253");
        List<CountryDTO> countryDTOS = Arrays.asList(countryDTO);
        Mockito.when(countryServiceImpl.getAllCountries()).thenReturn(countryDTOS);

        mvc.perform(get("/countries")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", hasSize(1)))
            .andExpect(jsonPath("$[0].country", is("Morocco")));
    }

}
package com.jumia.demo.dto;

public class CountryDTO {

    private String country;
    private String state;
    private String code;
    private String phone;

    public CountryDTO(String country, String state, String code, String phone) {
        this.country = country;
        this.state = state;
        this.code = code;
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

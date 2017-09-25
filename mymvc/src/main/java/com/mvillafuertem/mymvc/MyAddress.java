package com.mvillafuertem.mymvc;

/**
 * Created by mvillafuertem on 9/25/17.
 */
public class MyAddress {

    private String street;
    private Integer number;
    private String postalCode;

    public MyAddress() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(final Integer number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }
}

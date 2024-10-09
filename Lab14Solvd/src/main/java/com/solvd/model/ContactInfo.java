package com.solvd.model;

public class ContactInfo {
    private String City;
    private String Street;
    private int Phone;
    private String Email;

    public ContactInfo(){};
    public ContactInfo(String city, String street, int phone, String email) {
        City = city;
        Street = street;
        Phone = phone;
        Email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                '}';
    }
}

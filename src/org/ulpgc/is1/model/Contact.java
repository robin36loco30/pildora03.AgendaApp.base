package org.ulpgc.is1.model;


public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public Contact(String telephone, String email, Address address) {
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public abstract String getName();

}
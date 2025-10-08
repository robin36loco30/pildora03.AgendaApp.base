package org.ulpgc.is1.model;


import java.util.ArrayList;
import java.util.List;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;
    private List<Member> members;


    public Contact(String telephone, String email, String street, int number, int floor, String city ) {
        this.telephone = telephone;
        this.email = email;
        this.address = new Address(street, number, floor, city);
        this.members = new ArrayList<>();
    }

    public void addMember(Contact this) {
        members.add(new Member( this));
    }

    public List<Member> getMembers() {
        return members;
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
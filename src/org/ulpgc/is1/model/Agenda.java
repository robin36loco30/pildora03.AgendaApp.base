package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private final ArrayList<Contact> contacts;
    private final ArrayList<Group> groups;

    public Agenda() {
        this.groups = new ArrayList<>();
        this.contacts = new ArrayList<>();

    }

    public void addCompany(String telephone, String email, String street, int number, int floor, String city, String name, String description){
        Company company = new Company(telephone, email, street, number, floor, city, name, description);
        if (!contacts.contains(company)) {
            contacts.add(company);
        }
    }

    public void addGroup(String grupo){
        Group group = new Group(grupo);
        if(!this.groups.contains(group)){
            groups.add(group);
        }

    }

    public void addPerson(String firstName, String LastName, String phone, String mail, String street, int number, int floor, String city) {
        Person person = new Person(phone, mail, street, number, floor, city, firstName, LastName);
        if (!this.contacts.contains(person)){
            contacts.add(person);
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

}
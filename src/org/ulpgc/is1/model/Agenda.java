package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contacts;
    private ArrayList<Group> groups;

    public Agenda() {
        this.groups = groups;
        this.contacts = contacts;

    }

    public void addPerson(Person person){
        contacts.add(person);
    }

    public void addCompany(Company company){
        contacts.add(company);
    }

    public void addGroup(String grupo){
        Group group = new Group(grupo);
        groups.add(group);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addPerson(String firstName, String LastName, String phone, String mail, String street, int number, int floor, String city) {
        Person person = new Person(phone, mail, street, number, floor, city, firstName, LastName);
    }
}
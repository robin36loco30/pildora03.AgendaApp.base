package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contacts;
    private ArrayList<Group> groups;

    public Agenda() {
        this.contacts = contacts;
        this.groups = groups;
    }

    public void addPerson(Person person){
        contacts.add(person);
    }

    public void addCompany(Company company){
        contacts.add(company);
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }


}
package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Group {
    private final String name;
    private ArrayList<Contact> contacts;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void removeContact(int indice){
        contacts.remove(indice);
    }


}
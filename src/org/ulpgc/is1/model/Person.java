package org.ulpgc.is1.model;

public class Person extends Contact {

    public String firstName;
    public String lastName;

    public Person(String telephone, String email, Address address, String firstName, String lastName) {
        super(telephone, email, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getName(){
        return firstName + " " + lastName;
    }

}

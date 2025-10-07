package org.ulpgc.is1.model;

public class Person extends Contact {

    public String firstName;
    public String lastName;

    public Person(String telephone, String email, String street, int number, int floor, String city, String firstName, String lastName) {
        super(telephone, email, street, number, floor, city);
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

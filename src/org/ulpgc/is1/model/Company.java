package org.ulpgc.is1.model;

public class Company extends Contact {
    public String name;
    public String description;

    public Company(String telephone, String email, Address address, String name, String description) {
        super(telephone, email, address);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

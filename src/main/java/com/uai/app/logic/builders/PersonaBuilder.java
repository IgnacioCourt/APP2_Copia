package com.uai.app.logic.builders;

import com.uai.app.dominio.Libro;

public class PersonaBuilder {

    private String name;
    private String address;
    private String country;
    private int cost;

    public PersonaBuilder() {
    }

    public PersonaBuilder witName(String name) {
        this.name = name;
        return this;
    }
    public PersonaBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonaBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public PersonaBuilder withCost(int cost) {
        this.cost = cost;
        return this;
    }
    //Return the finally consrcuted User object
    public Libro build() {
        Libro user =  new Libro();
        user.setAddress(this.address);
        user.setCost(this.cost);
        user.setCountry(this.country);
        user.setName(this.name);
        validateUserObject(user);
        return user;
    }

    private void validateUserObject(Libro user) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}

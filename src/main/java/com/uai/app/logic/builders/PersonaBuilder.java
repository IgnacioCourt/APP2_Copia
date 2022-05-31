package com.uai.app.logic.builders;

import com.uai.app.dominio.Libro;

public class PersonaBuilder { //aca tambien siosi

    private String titulo;
    private String autor;
    private int anio;
    private int estante_numero;
    private String estante_seccion;
    private int piso;
    private String edificio;
    private String sede;

    public PersonaBuilder() {
    }

    public PersonaBuilder witTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    public PersonaBuilder withAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public PersonaBuilder withAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public PersonaBuilder withEstante_numero(int estante_numero) {
        this.estante_numero = estante_numero;
        return this;
    }

    public PersonaBuilder withEstante_seccion(String estante_seccion) {
        this.estante_seccion = estante_seccion;
        return this;
    }

    public PersonaBuilder withPiso(int piso) {
        this.piso = piso;
        return this;
    }

    public PersonaBuilder withEdificio(String edificio) {
        this.edificio = edificio;
        return this;
    }

    public PersonaBuilder withSede(String sede) {
        this.sede = sede;
        return this;
    }


    //Return the finally consrcuted User object
    public Libro build() {
        Libro user =  new Libro();
        user.setTitulo(this.titulo);
        user.setAutor(this.autor);
        user.setAnio(this.anio);
        user.setEstante_numero(this.estante_numero);
        user.setEstante_seccion(this.estante_seccion);
        user.setPiso(this.piso);
        user.setEdificio(this.edificio);
        user.setSede(this.sede);
        validateUserObject(user);
        return user;
    }

    private void validateUserObject(Libro user) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}

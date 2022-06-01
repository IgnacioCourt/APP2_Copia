package com.uai.app.ui.utils.funciones;

public class Seccion {
    String estante_seccion;
    int estante_numero;

    String sede;

    public Seccion(String estante_seccion) {
        this.estante_seccion = estante_seccion;
    }

    public Seccion(String estante_seccion, int estante_numero, String sede) {
        this.estante_seccion = estante_seccion;
        this.estante_numero = estante_numero;
        this.sede = sede;
    }

    public void setEstante_seccion(String estante_seccion) {
        this.estante_seccion = estante_seccion;
    }

    public void setEstante_numero(int estante_numero) {
        this.estante_numero = estante_numero;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}

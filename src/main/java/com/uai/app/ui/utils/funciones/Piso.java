package com.uai.app.ui.utils.funciones;

public class Piso {

    int piso;

    String estante_seccion;

    int estante_numero;

    String sede;

    public Piso(int piso) {
        this.piso = piso;
    }

    public Piso(int piso, String estante_seccion, int estante_numero, String sede) {
        this.piso = piso;
        this.estante_seccion = estante_seccion;
        this.estante_numero = estante_numero;
        this.sede = sede;
    }

    public void setPiso(int piso) {
        this.piso = piso;
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

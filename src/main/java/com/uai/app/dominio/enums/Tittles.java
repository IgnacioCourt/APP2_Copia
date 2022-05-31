package com.uai.app.dominio.enums;

public enum Tittles {

    TITULO("titulo"),AUTOR("autor"),ANIO("anio"),ESTANTE_NUMERO("estante numero"),ESTANTE_SECCION("estante_seccion"),PISO("piso"),EDIFICIO("edificio"),SEDE("sede"); //definitivamente aca

    private String val;

    public String getVal() {
        return val;
    }

    Tittles(String val) {
        this.val = val;
    }

}

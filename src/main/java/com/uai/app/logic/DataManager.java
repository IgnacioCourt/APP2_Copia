package com.uai.app.logic;

import com.uai.app.dominio.Libro;
import com.uai.app.exceptions.DataNotLoadedException;
import com.uai.app.ui.utils.*;


import java.util.*;

/*
*
* Dado que solo necesitare una instancia de esta clase
* la convierto en SIngleton https://refactoring.guru/design-patterns/singleton
* Esta clase es la que me va a manejar todo el tiempo mi data en memoria
 */
public class DataManager {

    private HashSet<Libro> data;

    private static DataManager instance;

    //todos los singletons
    // tienen constructores privados
    private  DataManager(){
    }

    public static DataManager getInstance(){
        if (instance == null){
            instance = new DataManager();
            SearchManager.getInstance();
        }
        return instance;
    }

    public HashSet<Libro> getData() {
        return data;
    }

    public void setData(HashSet<Libro> data) {
        this.data = data;
    }

    public String getDataAsString() throws DataNotLoadedException {
        //verifico que la data exista y sino devuelvo excepcion
        if (AppUtils.isNull(data)){
          throw new DataNotLoadedException();
        }
        //Creo un string para ir sumando ahi la data
        StringBuilder sb = new StringBuilder(data.size()*50);
        for (Libro p : data){
               sb.append(p);
               sb.append("\n");
        }
        return sb.toString();
    }

    public void agregarPersona(Libro p){
        this.data.add(p);
    }

    public void removerPersona(Libro p){
        this.data.remove(p);
    }

    public void removerPersonas(Collection<Libro> libros){
        this.data.removeAll(libros);
    }
}

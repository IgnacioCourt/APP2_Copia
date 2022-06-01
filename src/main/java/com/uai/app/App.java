package com.uai.app;

import com.uai.app.dominio.enums.Tittles;
import com.uai.app.exceptions.CSVNotFoundException;
import com.uai.app.files.FileManager;
import com.uai.app.logic.DataManager;
import com.uai.app.logic.SearchManager;
import com.uai.app.ui.utils.UIBuilder;
import com.uai.app.ui.MainMenuUI;
import com.uai.app.ui.utils.menuConsola.MenuConsola;

import java.io.*;
import java.util.Map;
import java.util.Scanner;


public class App {

    private static FileManager fileManager;

    public static void main(String[] args ) throws IOException {
        System.out.println("COMENZANDO APP2 DE BIBLIOTECA");
        String fileName = args[0];

        try {
            //instancio el file manager
            fileManager = new FileManager(fileName);
            //instancio y seteo la data
            DataManager.getInstance().setData(fileManager.getData());

            //aca ya puedo llamar al menu
            UIBuilder.buildMainUI(MainMenuUI.class);

            //finalizo guardando la data

        } catch (CSVNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //Mostrar el menu
        MenuConsola menu_activo = new MenuConsola();
        menu_activo.mostrar_menu();
        //Pedir una opcion
        System.out.println("Por Favor ingrese una opcion del menu : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // Llamar al menu con la opcion "num"
        menu_activo.ejecutar(num);

        System.out.println("Terminado");

    }

    public static void saveData(){
        fileManager.saveData();
    }
}

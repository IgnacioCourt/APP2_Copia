package com.uai.app.ui.utils.menuConsola;

import com.uai.app.dominio.Libro;
import com.uai.app.ui.utils.funciones.Piso;
import com.uai.app.ui.utils.funciones.Seccion;
import com.uai.app.ui.utils.funciones.Sede;

import java.util.Scanner;

public class MenuConsola {
    private int opcion;

        public void mostrar_menu(){
            System.out.println("La base de Datos puede verse en la pestaña emergente.\nPara utilizar la aplicacion no presione la X de la pestaña hasta terminar de utilizarla.\n -----------------------------------------\n");
            System.out.println("Menu de opciones: ");
            System.out.println("0)  Cerrar menu / Salir del programa");

            System.out.println("1)  Agregar un nuevo libro");
            System.out.println("2)  Quitar un libro");
            System.out.println("3)  Editar un libro");
            System.out.println("4)  Agregar una sede");
            System.out.println("5)  Quitar una sede");
            System.out.println("6)  Agregar una seccion");
            System.out.println("7)  Quitar una seccion");
            System.out.println("8)  Agregar un piso");
            System.out.println("9) Quitar un piso");
            System.out.println("10) Buscar un libro");

        }

        public void ejecutar(int opcion){
            boolean flag = true;
            int cont=0;
            Scanner scan0 = new Scanner(System.in);
            do {
                while(flag) {
                    if(cont>0){
                        MenuConsola menu_activo = new MenuConsola();
                        menu_activo.mostrar_menu();

                        opcion = scan0.nextInt();

                    }
                    cont++;

                    switch (opcion) {
                        case 0:

                            System.out.println("La aplicación se ha cerrado. Recuerde cerrar las pestañas emergentes.\n");
                            flag = false;
                            break;

                        case 1:
                            System.out.println("Ingrese el titulo del Libro que desea agregar: ");
                            Scanner scan = new Scanner(System.in);
                            String tituloNuevo = scan.next();
                            Libro libro= new Libro(tituloNuevo);
                            System.out.println("El libro "+tituloNuevo+" a sido agregado correctamente");

                            break;

                        case 2:
                            System.out.println("Ingrese el titulo del Libro que desea eliminar: ");
                            //Scanner scan2 = new Scanner(System.in);
                            //String tituloEliminar = scan2.next();
                            //libros.removeIf(libro.getTitulo().equals(tituloEliminar));
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");
                            break;

                        case 3:
                            System.out.println("Ingrese el titulo del Libro que desea editar: ");
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");

                            break;
                        case 4:
                            System.out.println("Ingrese el nombre de sede de la Sede que desea agregar: ");
                            Scanner scan4 = new Scanner(System.in);
                            String sedeNueva = scan4.next();
                            Sede sede= new Sede(sedeNueva);
                            System.out.println("La sede "+sedeNueva+" a sido agregada correctamente");

                            break;
                        case 5:
                            System.out.println("Ingrese el nombre de sede de la Sede que desea eliminar: ");
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");

                            break;
                        case 6:

                            System.out.println("Como desea agregar una seccion:\n1) Unicamente con el nombre de estante (estante_seccion)\n2) Con estante_seccion, estante_numero y sede.\nElija una opcion : ");
                            Scanner scan6 = new Scanner(System.in);
                            int opcion6 = scan6.nextInt();
                            if (opcion6==1){
                                System.out.println("Ingrese el nombre de estante_seccion de la Seccion que desea agregar: ");
                                Scanner scan61 = new Scanner(System.in);
                                String estante_seccionNueva = scan61.next();
                                Seccion seccion= new Seccion(estante_seccionNueva);
                                System.out.println("El estante "+estante_seccionNueva+" a sido agregado correctamente");
                                break;
                            }else{
                                if (opcion6==2){
                                    System.out.println("Ingrese el nombre de estante_seccion de la Seccion que desea agregar: ");
                                    Scanner scan62 = new Scanner(System.in);
                                    String estante_seccionNueva = scan62.next();

                                    System.out.println("Ingrese el numero de estante_numero de la Seccion que desea agregar: ");
                                    Scanner scan63 = new Scanner(System.in);
                                    int estante_numeroNueva = scan63.nextInt();

                                    System.out.println("Ingrese el nombre de sede de la Seccion que desea agregar: ");
                                    Scanner scan64 = new Scanner(System.in);
                                    String sedeNuevaSeccion = scan64.next();

                                    Seccion seccion= new Seccion(estante_seccionNueva,estante_numeroNueva,sedeNuevaSeccion);
                                    System.out.println("El estante "+estante_seccionNueva+" a sido agregado correctamente");
                                    break;

                                }else{
                                    System.out.println("No fue una opcion válida. Volvemos al menu.");
                                    break;
                                }
                            }


                        case 7:
                            System.out.println("Ingrese el nombre de estante_seccion de la Seccion que desea eliminar: ");
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");
                            break;

                        case 8:
                            System.out.println("Como desea agregar un piso:\n1) Unicamente con el numero de piso \n2) Con piso, estante_seccion, estante_numero y sede.\nElija una opcion : ");
                            Scanner scan8 = new Scanner(System.in);
                            int opcion8 = scan8.nextInt();
                            if (opcion8==1){
                                System.out.println("Ingrese el numero de piso del Piso que desea agregar: ");
                                Scanner scan81 = new Scanner(System.in);
                                int pisoNuevo = scan81.nextInt();
                                Piso piso= new Piso(pisoNuevo);
                                System.out.println("El piso "+pisoNuevo+" a sido agregado correctamente");
                                break;
                            }else{
                                if (opcion8==2){
                                    System.out.println("Ingrese el nombre de piso del Piso que desea agregar: ");
                                    Scanner scan81 = new Scanner(System.in);
                                    int pisoNuevo2 = scan81.nextInt();

                                    System.out.println("Ingrese el nombre de estante_seccion del Piso que desea agregar: ");
                                    Scanner scan82 = new Scanner(System.in);
                                    String estante_seccionNueva = scan82.next();

                                    System.out.println("Ingrese el numero de estante_numero del Piso que desea agregar: ");
                                    Scanner scan83 = new Scanner(System.in);
                                    int estante_numeroNueva = scan83.nextInt();

                                    System.out.println("Ingrese el nombre de sede del Piso que desea agregar: ");
                                    Scanner scan84 = new Scanner(System.in);
                                    String sedeNuevaSeccion = scan84.next();

                                    Piso piso= new Piso(pisoNuevo2,estante_seccionNueva,estante_numeroNueva,sedeNuevaSeccion);
                                    System.out.println("El piso "+pisoNuevo2+" a sido agregado correctamente");
                                    break;

                                }else{
                                    System.out.println("No fue una opcion válida. Volvemos al menu.");
                                    break;
                                }
                            }


                        case 9:
                            System.out.println("Ingrese el nombre de piso del Piso que desea eliminar: ");
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");


                            break;
                        case 10:
                            System.out.println("Ingrese el titulo del Libro que desea buscar: ");
                            System.out.println("Lo siento, esta funcion todavia no esta disponible, porfavor elija otra opcion.");
                            break;

                        default:
                            System.out.println("Por favor elija un opcion valida");
                            break;
                        }
                }
            }while (opcion!=0);
        }

}

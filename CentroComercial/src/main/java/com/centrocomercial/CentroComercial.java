/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centrocomercial;

import com.centrocomercial.clases.Accesos;
import com.centrocomercial.clases.Aseos;
import com.centrocomercial.clases.Locales;
import com.centrocomercial.controlusuarios.ControlUsuarios;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class CentroComercial {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locales[] locales = new Locales[9];

        locales[0] = new Locales("Burger King", 60, 50, 0, "1R", "12:00", "1:30am", false, true, 1);
        locales[1] = new Locales("KFC", 45, 20, 0, "2R", "12:00", "1:30am", false, true, 1);
        locales[2] = new Locales("Restaurante", 60, 50, 0, "3R", "12:00", "1:30am", true, false, 1);
        locales[3] = new Locales("Zara", 150, 100, 1, "1M", "9:00am", "22:00", false, true, 1);
        locales[4] = new Locales("C&A", 100, 95, 0, "2M", "9:00am", "21:30", false, true, 1);
        locales[5] = new Locales("Local moda", 60, 50, 0, "3M", "9:00am", "21:30", true, false, 1);
        locales[6] = new Locales("Yelmo Cines", 400, 350, 0, "1O", "15:00", "2:00am", false, true, 1);
        locales[7] = new Locales("Local Ocio", 100, 90, 0, "2O", "12:00", "1:30am", true, false, 1);
        locales[8] = new Locales("Bolera", 80, 50, 0, "3O", "17:00", "23:30", false, true, 1);

        Accesos[] accesos = new Accesos[4];
        accesos[0] = new Accesos(1, "Portal", true, "001", "09:00", "21:00", true, true, 0);
        accesos[1] = new Accesos(1, "Elevador", true, "002", "09:00", "21:00", true, true, 1);
        accesos[2] = new Accesos(1, "Rampa", true, "003", "09:00", "21:00", true, true, 1);
        accesos[3] = new Accesos(1, "Parking", true, "000", "09:00", "03:00", true, true, -1);
        
        Aseos[] aseos = new Aseos [4];
        aseos[0] = new Aseos(1, 35, true, "001", "09:00", "21:00", true, true, 1);
        aseos[1] = new Aseos(1, 35, true, "001", "09:00", "21:00", true, true, 1);
        aseos[2] = new Aseos(0, 25, true, "001", "09:00", "21:00", true, true, 1);
        aseos[3] = new Aseos(-0, 15, true, "001", "09:00", "03:00", true, true, 1);
        
        ControlUsuarios controlUsuarios = new ControlUsuarios();
        controlUsuarios.addUsuario("José Carlos", "Cruzado");
        controlUsuarios.addUsuario ("d.tortosa", "holi");
        controlUsuarios.addUsuario("1", "1");
        
        boolean controlPrincipal = false, controlAcceso = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a GestionAPP, tu aplicación para gestionar Centros Comerciales.");
        
        while (!controlPrincipal) {
            System.out.println ("Seleccione una opción:");
            System.out.println ("1. Acceder con usuario.");
            System.out.println ("2. Crear nuevo usuario.");
            System.out.println ("\nIngrese una opción: ");
            int opcionControl = scanner.nextInt();
            scanner.nextLine();
            
            if (opcionControl == 1) {
                while (!controlAcceso) {

                    System.out.println("Introduzca su usuario:");
                    String usuario = scanner.nextLine();
                    System.out.println("Introduzca su clave:");
                    String pass = scanner.nextLine();

                    if (controlUsuarios.checkUsuario(usuario, pass))
                        controlAcceso = true;
                    else
                        System.out.println("\nError en los datos introducidos. Inténtelo de nuevo.\n");
                    
                    controlPrincipal = true;
                }
            } else if (opcionControl == 2) {
                System.out.println("Introduzca su nombre de usuario:");
                String usuario = scanner.nextLine();
                System.out.println("Introduzca su clave:");
                String pass = scanner.nextLine();

                controlUsuarios.addUsuario(usuario, pass);
                System.out.println ("Su usuario ha sido creado.\n");
            }
        }
        
        MenuPrincipal(locales, accesos, aseos);
    }


    public static void MenuPrincipal(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        
        Scanner scanner = new Scanner(System.in);
        int opciones = 0;

        System.out.println("\n*****Menú principal*****\n");
        System.out.println("1: Gestión de accesos.");
        System.out.println("2: Gestión de locales.");
        System.out.println("3: Gestión de parking.");
        System.out.println("4: Gestión de aseos.");
        System.out.println("5: Salir");
        System.out.println("Introduzca la gestión a realizar: ");

        opciones = scanner.nextInt();
        switch (opciones) {
            case 1:

                MenuAccesos(locales, accesos, aseos);
                break;

            case 2:

                MenuLocales(locales, accesos, aseos);
                break;

            case 3:

                MenuParking(locales, accesos, aseos);
                break;

            case 4:

                MenuAseos(locales, accesos, aseos);
                break;

            case 5:

                System.out.println("Gracias por utilizar GestionAPP.");

                System.exit(0);

                break;

            default:

                break;
        }

    }

    
    public static void MenuAccesos(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        
        System.out.println("\n*****Menú Gestión de accesos*****");
        System.out.println("1: Ver Accesos.");
        System.out.println("2: Ver horario de apertura.");
        System.out.println("3: Ver situación del acceso.");
        System.out.println("4: Llamar a seguridad.");
        System.out.println("5: Llamar a emergencias.");
        System.out.println("6: Abrir el acceso.");
        System.out.println("7: Cerrar el acceso.");
        System.out.println("8: Control de personas.");
        System.out.println("9: Realizar reparaciones.");
        System.out.println("10: Realizar limpieza.");
        System.out.println("11: Volver al menú principal");
        System.out.println("Teclee su opción: ");


        Scanner scanner = new Scanner(System.in);
        int opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver accesos.");

                for (int i = 0; i < accesos.length; i++) {
                    System.out.println("Número acceso " + i + ": " + accesos[i]);
                }
                MenuAccesos(locales, accesos, aseos);
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].horarioApertura());
                MenuAccesos(locales, accesos, aseos);
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].indicativoLugar(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 4:
                System.out.println("Elegiste la opción llamar a seguridad.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].llamarVigilancia(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 5:
                System.out.println("Elegiste la opción llamar a emergencias.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].llamarEmergencias(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].abrirPaso(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].cerrarPaso(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].controlPersonas(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].reparar(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].limpiar(accesos[opciones].getId()));
                MenuAccesos(locales, accesos, aseos);
                break;

            case 11:
                MenuPrincipal(locales, accesos, aseos);
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuAccesos(locales, accesos, aseos);
                break;

        }

    }

    public static void MenuLocales(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        
        System.out.println("\n*****Menú Gestión de locales*****");
        System.out.println("1: Ver locales.");
        System.out.println("2: Ver horario de apertura.");
        System.out.println("3: Ver situación del local.");
        System.out.println("4: Alquilar local.");
        System.out.println("5: Rescindir contrato alquiler.");
        System.out.println("6: Realizar reparaciones.");
        System.out.println("7: Realizar limpieza.");
        System.out.println("8: Volver al menú principal");
        System.out.println("Teclee su opción: ");

        int opciones = 0;

        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver locales.");
                for (int i = 0; i < locales.length; i++) {
                    System.out.println("Número local " + i + ": " + locales[i].toString());
                }

                MenuLocales(locales, accesos, aseos);
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].horarioApertura());

                MenuLocales(locales, accesos, aseos);
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del local.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].indicativoLugar(locales[opciones].getId()));
                MenuLocales(locales, accesos, aseos);
                break;
            case 4:
                System.out.println("Elegiste la opción alquilar local.");
                boolean vacios = false;
                for (int i = 0; i < locales.length; i++) {
                    if (locales[i].isDisponible()) {
                        System.out.println("Local disponible " + i + " " + locales[i]);
                        vacios = true;
                    }
                }
                
                if (!vacios)
                    System.out.println("No hay locales para alquilar.");
                else {
                    System.out.println("Introduzca el número del local: ");
                    opciones = scanner.nextInt();
                    System.out.println(locales[opciones].alquilarLocal(locales[opciones].getId()));
                    MenuLocales(locales, accesos, aseos);
                }
                break;
            case 5:
                System.out.println("Elegiste la opción rescindir contrato alquiler.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].rescindirContrato(locales[opciones].getId()));
                MenuLocales(locales, accesos, aseos);
                break;
            
            
            case 6:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].reparar(locales[opciones].getId()));
                MenuLocales(locales, accesos, aseos);
                break;
            case 7:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].limpiar(locales[opciones].getId()));
                MenuLocales(locales, accesos, aseos);
                break;

            case 8:
                MenuPrincipal(locales, accesos, aseos);
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuLocales(locales, accesos, aseos);
                break;

        }

    }

    public static void MenuParking(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        System.out.println("\n*****Menú Gestión de parking*****");
        System.out.println("1: Ver parking.");
        System.out.println("2: Ver horario de apertura.");
        System.out.println("3: Ver situación del parking.");
        System.out.println("4: Ver plazas disponibles.");
        System.out.println("5: Abrir parking.");
        System.out.println("6: Cerrar parking.");
        System.out.println("7: Abrir el acceso.");
        System.out.println("8: Cerrar el acceso.");
        System.out.println("9: Control de personas.");
        System.out.println("10: Realizar reparaciones.");
        System.out.println("11: Realizar limpieza.");
        System.out.println("12: Volver al menú principal");
        System.out.println("Teclee su opción: ");

        int opciones = 0;
        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver parking.");

                MenuParking(locales, accesos, aseos);
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");

                MenuParking(locales, accesos, aseos);
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del parking.");

                MenuParking(locales, accesos, aseos);
                break;
            case 4:
                System.out.println("Elegiste la opción ver plazas disponibles.");

                MenuParking(locales, accesos, aseos);
                break;
            case 5:
                System.out.println("Elegiste la opción abrir parking.");

                MenuParking(locales, accesos, aseos);
                break;
            case 6:
                System.out.println("Elegiste la opción cerrar parking.");

                MenuParking(locales, accesos, aseos);
                break;
            case 7:
                System.out.println("Elegiste la opción abrir el acceso.");

                MenuParking(locales, accesos, aseos);
                break;
            case 8:
                System.out.println("Elegiste la opción cerrar el acceso.");

                MenuParking(locales, accesos, aseos);
                break;
            case 9:
                System.out.println("Elegiste la opción control de personas.");

                MenuParking(locales, accesos, aseos);
                break;
            case 10:
                System.out.println("Elegiste la opción realizar reparaciones.");

                MenuParking(locales, accesos, aseos);
                break;

            case 11:
                System.out.println("Elegiste la opción realizar limpieza.");
                MenuParking(locales, accesos, aseos);
                break;

            case 12:
                MenuPrincipal(locales, accesos, aseos);
                break;
                
            default:
                System.out.println("No ha introducido un valor válido.");
                MenuParking(locales, accesos, aseos);
                break;

        }

    }

    public static void MenuAseos(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        System.out.println("\n*****Menú Gestión de aseos*****");
        System.out.println("1: Ver aseos.");
        System.out.println("2: Ver horario de apertura.");
        System.out.println("3: Ver situación del aseo.");
        System.out.println("4: Rellenar suministros.");
        System.out.println("5: Solicitar limpieza.");
        System.out.println("6: Abrir el acceso.");
        System.out.println("7: Cerrar el acceso.");
        System.out.println("8: Control de personas.");
        System.out.println("9: Realizar reparaciones.");
        System.out.println("10: Realizar limpieza.");
        System.out.println("11: Volver al menú principal");
        System.out.println("Teclee su opción: ");

        int opciones = 0;
        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver aseos.");
                for (int i = 0; i < aseos.length; i++) {
                    System.out.println("Número aseos " + i + ": " + aseos[i].toString());
                }
                MenuAseos(locales, accesos, aseos);
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].horarioApertura());
                MenuAseos(locales, accesos, aseos);
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del aseo.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].indicativoLugar(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;
            case 4:
                System.out.println("Elegiste la opción rellenar suministros.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].rellenar());
                MenuAseos(locales, accesos, aseos);
                break;
            case 5:
                System.out.println("Elegiste la opción solicitar limpieza.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].solicitarLimpieza());
                MenuAseos(locales, accesos, aseos);
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].abrirPaso(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].cerrarPaso(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].controlPersonas(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].reparar(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].limpiar(aseos[opciones].getId()));
                MenuAseos(locales, accesos, aseos);
                break;

            case 11:
                MenuPrincipal(locales, accesos, aseos);
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuAseos(locales, accesos, aseos);
                break;

        }

    }

}

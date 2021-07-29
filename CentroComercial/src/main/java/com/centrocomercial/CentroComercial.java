/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centrocomercial;

import com.centrocomercial.accesos.Accesos;
import com.centrocomercial.clases.Locales;
import java.util.HashMap;
import java.util.Map;
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

        Accesos acceso = new Accesos();

        /**
         * Ojo, he tenido que usar el setter para poder hacer la prueba, el
         * método addUsuario parece es usuarios.put(pass, pass); creo que
         * debería ser usuarios.put(nombre, pass);
         */
        Map<String, String> usuario = new HashMap<>();
        usuario.put("d.tortosa", "cursojava");
        acceso.setUsuarios((HashMap<String, String>) usuario);

        //**************************************************
        //Prueba con usuarios.put
        acceso.addUsuario("holi", "holiclave");

        //Probamos diferentes métodos:
        //System.out.println("Acceso de d.tortosa: " + acceso.checkUsuario("d.tortosa", "cursojava"));
        //System.out.println("Acceso de holi: "+acceso.checkUsuario("holi", "holiclave"));
        //System.out.println("Acceso de holiclave: "+acceso.checkUsuario("holiclave", "holiclave"));
        //****************************************************************************************
        System.out.println("Bienvenido a GestionAPP, tu aplicación para gestionar Centros Comerciales.");
        login(acceso);

    }

    public static void login(Accesos acceso) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;

        while (intentos < 3) {
            intentos++;

            System.out.println("Introduzca su usuario:");
            String usuario = scanner.next();
            System.out.println("Introduzca su clave:");
            String pass = scanner.next();

            if (acceso.checkUsuario(pass, pass)) {
                System.out.println("Acceso concedido.\n\nBienvenido, " + pass + "\n");
                MenuPrincipal();
            } else {
                System.out.println("Contraseña incorrecta. Número de intentos: " + intentos);
                System.out.println("Intentos restantes: " + (3 - intentos) + "\n");
            }
            if (intentos == 3) {
                System.out.println("Usuario bloqueado. Se cerrará la aplicación.");
            }

        }

    }

    public static void MenuPrincipal() {
        int opciones = 0;

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Menú principal*****");
        System.out.println("1: Gestión de accesos.");
        System.out.println("2: Gestión de locales.");
        System.out.println("3: Gestión de parking.");
        System.out.println("4: Gestión de aseos.");
        System.out.println("5: Salir");
        System.out.println("Introduzca la gestión a realizar: ");

        opciones = scanner.nextInt();
        switch (opciones) {
            case 1:

                MenuAccesos();
                break;

            case 2:

                MenuLocales(locales);
                break;

            case 3:

                MenuParking();
                break;

            case 4:

                MenuAseos();
                break;

            case 5:

                System.out.println("Gracias por utilizar GestionAPP.");

                System.exit(0);

                break;

            default:

                break;
        }

    }

    public static void MenuAccesos() {
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

        int opciones = 0;
        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver accesos.");

                MenuAccesos();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");

                MenuAccesos();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del acceso.");

                MenuAccesos();
                break;
            case 4:
                System.out.println("Elegiste la opción llamar a seguridad.");

                MenuAccesos();
                break;
            case 5:
                System.out.println("Elegiste la opción llamar a emergencias.");

                MenuAccesos();
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");

                MenuAccesos();
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");

                MenuAccesos();
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");

                MenuAccesos();
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");

                MenuAccesos();
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");

                MenuAccesos();
                break;

            case 11:
                MenuPrincipal();
                break;

            default:
                break;

        }

    }

    public static void MenuLocales(Locales[] locales) {
        System.out.println("\n*****Menú Gestión de locales*****");
        System.out.println("1: Ver locales.");
        System.out.println("2: Ver horario de apertura.");
        System.out.println("3: Ver situación del local.");
        System.out.println("4: Alquilar local.");
        System.out.println("5: Rescindir contrato alquiler.");
        System.out.println("6: Abrir el acceso.");
        System.out.println("7: Cerrar el acceso.");
        System.out.println("8: Control de personas.");
        System.out.println("9: Realizar reparaciones.");
        System.out.println("10: Realizar limpieza.");
        System.out.println("11: Volver al menú principal");

        int opciones = 0;

        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver locales.");

                for (int i = 0; i < locales.length; i++) {
                    System.out.println("Número local " + i + ": " + locales[i].toString());
                }

                MenuLocales(locales);
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].getHorarioApertura());

                MenuLocales(locales);
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del local.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].indicativoLugar());
                MenuLocales(locales);
                break;
            case 4:
                System.out.println("Elegiste la opción alquilar local.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].alquilarLocal(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 5:
                System.out.println("Elegiste la opción rescindir contrato alquiler.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].rescindirContrato(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].abrirPaso(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
               System.out.println( locales[opciones].cerrarPaso(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].controlPersonas(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].reparar(locales[opciones].getId()));
                MenuLocales(locales);
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].limpiar(locales[opciones].getId()));
                MenuLocales(locales);
                break;

            case 11:
                MenuPrincipal();
                break;

            default:
                break;

        }

    }

    public static void MenuParking() {
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

        int opciones = 0;
        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver parking.");

                MenuParking();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");

                MenuParking();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del parking.");

                MenuParking();
                break;
            case 4:
                System.out.println("Elegiste la opción ver plazas disponibles.");

                MenuParking();
                break;
            case 5:
                System.out.println("Elegiste la opción abrir parking.");

                MenuParking();
                break;
            case 6:
                System.out.println("Elegiste la opción cerrar parking.");

                MenuParking();
                break;
            case 7:
                System.out.println("Elegiste la opción abrir el acceso.");

                MenuParking();
                break;
            case 8:
                System.out.println("Elegiste la opción cerrar el acceso.");

                MenuParking();
                break;
            case 9:
                System.out.println("Elegiste la opción control de personas.");

                MenuParking();
                break;
            case 10:
                System.out.println("Elegiste la opción realizar reparaciones.");

                MenuParking();
                break;

            case 11:
                System.out.println("Elegiste la opción realizar limpieza.");
                MenuParking();
                break;

            case 12:
                MenuPrincipal();
                break;
            default:
                break;

        }

    }

    public static void MenuAseos() {
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

        int opciones = 0;
        Scanner scanner = new Scanner(System.in);
        opciones = scanner.nextInt();
        switch (opciones) {

            case 1:
                System.out.println("Elegiste la opción ver aseos.");

                MenuAseos();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");

                MenuAseos();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del aseo.");

                MenuAseos();
                break;
            case 4:
                System.out.println("Elegiste la opción rellenar suministros.");

                MenuAseos();
                break;
            case 5:
                System.out.println("Elegiste la opción solicitar limpieza.");

                MenuAseos();
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");

                MenuAseos();
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");

                MenuAseos();
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");

                MenuAseos();
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");

                MenuAseos();
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");

                MenuAseos();
                break;

            case 11:
                MenuPrincipal();
                break;

            default:
                break;

        }

    }

}

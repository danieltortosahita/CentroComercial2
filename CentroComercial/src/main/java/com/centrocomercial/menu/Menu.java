/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centrocomercial.menu;

import com.centrocomercial.clases.Accesos;
import com.centrocomercial.clases.Aseos;
import com.centrocomercial.clases.Locales;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Menu {

    private Locales[] locales;
    private Accesos[] accesos;
    private Aseos[] aseos;

    public Menu() {

    }

    public Menu(Locales[] locales, Accesos[] accesos, Aseos[] aseos) {
        this.locales = locales;
        this.accesos = accesos;
        this.aseos = aseos;
    }

    public void MenuPrincipal() {

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

                MenuAccesos();
                break;

            case 2:

                MenuLocales();
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

    public void MenuAccesos() {

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
                MenuAccesos();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].horarioApertura());
                MenuAccesos();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].indicativoLugar(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 4:
                System.out.println("Elegiste la opción llamar a seguridad.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].llamarVigilancia(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 5:
                System.out.println("Elegiste la opción llamar a emergencias.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].llamarEmergencias(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].abrirPaso(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].cerrarPaso(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].controlPersonas(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].reparar(accesos[opciones].getId()));
                MenuAccesos();
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del acceso: ");
                opciones = scanner.nextInt();
                System.out.println(accesos[opciones].limpiar(accesos[opciones].getId()));
                MenuAccesos();
                break;

            case 11:
                MenuPrincipal();
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuAccesos();
                break;

        }

    }

    public void MenuLocales() {

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

                MenuLocales();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].horarioApertura());

                MenuLocales();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del local.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].indicativoLugar(locales[opciones].getId()));
                MenuLocales();
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

                if (!vacios) {
                    System.out.println("No hay locales para alquilar.");
                    MenuLocales();
                } else {
                    System.out.println("Introduzca el número del local: ");
                    opciones = scanner.nextInt();
                    System.out.println(locales[opciones].alquilarLocal(locales[opciones].getId()));
                    MenuLocales();
                }
                break;
            case 5:
                System.out.println("Elegiste la opción rescindir contrato alquiler.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].rescindirContrato(locales[opciones].getId()));
                MenuLocales();
                break;

            case 6:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].reparar(locales[opciones].getId()));
                MenuLocales();
                break;
            case 7:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del local: ");
                opciones = scanner.nextInt();
                System.out.println(locales[opciones].limpiar(locales[opciones].getId()));
                MenuLocales();
                break;

            case 8:
                MenuPrincipal();
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuLocales();
                break;

        }

    }

    public void MenuParking() {
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
                System.out.println("No ha introducido un valor válido.");
                MenuParking();
                break;

        }

    }

    public void MenuAseos() {
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
                MenuAseos();
                break;

            case 2:
                System.out.println("Elegiste la opción ver horario de apertura.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].horarioApertura());
                MenuAseos();
                break;

            case 3:
                System.out.println("Elegiste la opción ver situación del aseo.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].indicativoLugar(aseos[opciones].getId()));
                MenuAseos();
                break;
            case 4:
                System.out.println("Elegiste la opción rellenar suministros.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].rellenar());
                MenuAseos();
                break;
            case 5:
                System.out.println("Elegiste la opción solicitar limpieza.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].solicitarLimpieza());
                MenuAseos();
                break;
            case 6:
                System.out.println("Elegiste la opción abrir el acceso.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].abrirPaso(aseos[opciones].getId()));
                MenuAseos();
                break;
            case 7:
                System.out.println("Elegiste la opción cerrar el acceso.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].cerrarPaso(aseos[opciones].getId()));
                MenuAseos();
                break;
            case 8:
                System.out.println("Elegiste la opción control de personas.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].controlPersonas(aseos[opciones].getId()));
                MenuAseos();
                break;
            case 9:
                System.out.println("Elegiste la opción realizar reparaciones.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].reparar(aseos[opciones].getId()));
                MenuAseos();
                break;
            case 10:
                System.out.println("Elegiste la opción realizar limpieza.");
                System.out.println("Introduzca el número del aseo: ");
                opciones = scanner.nextInt();
                System.out.println(aseos[opciones].limpiar(aseos[opciones].getId()));
                MenuAseos();
                break;

            case 11:
                MenuPrincipal();
                break;

            default:
                System.out.println("No ha introducido un valor válido.");
                MenuAseos();
                break;

        }

    }

}

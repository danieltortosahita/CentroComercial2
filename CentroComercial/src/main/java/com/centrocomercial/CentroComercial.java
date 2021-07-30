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
import com.centrocomercial.menu.Menu;
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
        Accesos[] accesos = new Accesos[4];
        Aseos[] aseos = new Aseos[4];

        locales[0] = new Locales("Burger King", 60, 50, 0, "1R", "12:00", "1:30am", false, true, 1);
        locales[1] = new Locales("KFC", 45, 20, 0, "2R", "12:00", "1:30am", false, true, 1);
        locales[2] = new Locales("Restaurante", 60, 50, 0, "3R", "12:00", "1:30am", true, false, 1);
        locales[3] = new Locales("Zara", 150, 100, 1, "1M", "9:00am", "22:00", false, true, 1);
        locales[4] = new Locales("C&A", 100, 95, 0, "2M", "9:00am", "21:30", false, true, 1);
        locales[5] = new Locales("Local moda", 60, 50, 0, "3M", "9:00am", "21:30", true, false, 1);
        locales[6] = new Locales("Yelmo Cines", 400, 350, 0, "1O", "15:00", "2:00am", false, true, 1);
        locales[7] = new Locales("Local Ocio", 100, 90, 0, "2O", "12:00", "1:30am", true, false, 1);
        locales[8] = new Locales("Bolera", 80, 50, 0, "3O", "17:00", "23:30", false, true, 1);

        accesos[0] = new Accesos(1, "Portal", true, "001", "09:00", "21:00", true, true, 0);
        accesos[1] = new Accesos(1, "Elevador", true, "002", "09:00", "21:00", true, true, 1);
        accesos[2] = new Accesos(1, "Rampa", true, "003", "09:00", "21:00", true, true, 1);
        accesos[3] = new Accesos(1, "Parking", true, "000", "09:00", "03:00", true, true, -1);

        aseos[0] = new Aseos(1, 35, true, "001", "09:00", "21:00", true, true, 1);
        aseos[1] = new Aseos(1, 35, true, "001", "09:00", "21:00", true, true, 1);
        aseos[2] = new Aseos(0, 25, true, "001", "09:00", "21:00", true, true, 1);
        aseos[3] = new Aseos(-0, 15, true, "001", "09:00", "03:00", true, true, 1);

        ControlUsuarios controlUsuarios = new ControlUsuarios();
        controlUsuarios.addUsuario("José Carlos", "Cruzado");
        controlUsuarios.addUsuario("d.tortosa", "holi");
        controlUsuarios.addUsuario("1", "1");

        boolean controlPrincipal = false, controlAcceso = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a GestionAPP, tu aplicación para gestionar Centros Comerciales.");

        while (!controlPrincipal) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Acceder con usuario.");
            System.out.println("2. Crear nuevo usuario.");
            System.out.println("\nIngrese una opción: ");
            int opcionControl = scanner.nextInt();
            scanner.nextLine();

            if (opcionControl == 1) {
                while (!controlAcceso) {

                    System.out.println("Introduzca su usuario:");
                    String usuario = scanner.nextLine();
                    System.out.println("Introduzca su clave:");
                    String pass = scanner.nextLine();

                    if (controlUsuarios.checkUsuario(usuario, pass)) {
                        controlAcceso = true;
                    } else {
                        System.out.println("\nError en los datos introducidos. Inténtelo de nuevo.\n");
                    }

                    controlPrincipal = true;
                }
            } else if (opcionControl == 2) {
                System.out.println("Introduzca su nombre de usuario:");
                String usuario = scanner.nextLine();
                System.out.println("Introduzca su clave:");
                String pass = scanner.nextLine();

                controlUsuarios.addUsuario(usuario, pass);
                System.out.println("Su usuario ha sido creado.\n");
            }
        }

        Menu menu = new Menu(locales, accesos, aseos);
        menu.MenuPrincipal();

    }

}

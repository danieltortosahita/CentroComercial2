/*
 * 
 */
package com.centrocomercial.clases;

import com.centrocomercial.interfaces.IControl;
import com.centrocomercial.interfaces.IReparaciones;

/**
 *
 * @author
 */
public class Aseos extends Edificio implements IReparaciones, IControl {

    private int planta;
    private int capacidad;
    private boolean limpio;

    @Override
    public String abrirPaso(String id) {
        return "";
    }

    @Override
    public String cerrarPaso(String id) {
        return "";
    }

    @Override
    public int controlPersonas(String id) {
        return 7;
    }

    @Override
    public String reparar(String id) {
        return "";
    }

    @Override
    public String limpiar(String id) {
        return "";
    }

}

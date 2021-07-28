package com.centrocomercial.clases;

import com.centrocomercial.interfaces.IControl;
import com.centrocomercial.interfaces.IReparaciones;

/**
 *
 * @author Dani
 */
public class Locales extends Edificio implements IControl, IReparaciones {

    private String tipoLocal;
    private int area, capacidad, numeroPlanta;

    public Locales(String id, String horarioApertura, String horarioCierre, boolean disponible, boolean abierto, int numeroPlantas) {
        super(id, horarioApertura, horarioCierre, disponible, abierto, numeroPlantas);
    }

    public Locales(String tipoLocal, int area, int capacidad, int numeroPlanta, String id, String horarioApertura, String horarioCierre, boolean disponible, boolean abierto, int numeroPlantas) {
        super(id, horarioApertura, horarioCierre, disponible, abierto, numeroPlantas);
        this.tipoLocal = tipoLocal;
        this.area = area;
        this.capacidad = capacidad;
        this.numeroPlanta = numeroPlanta;
    }

    
    
    
    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    @Override
    public String toString() {
        return "Locales{" + "tipoLocal=" + tipoLocal + ", area=" + area + ", capacidad=" + capacidad + ", numeroPlanta=" + numeroPlanta + '}';
    }

    @Override
    public void abrirPaso(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarPaso(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void controlPersonas(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reparar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Con este método lo que haremos será alquilar el local. Verificaremos si
     * este local está alquilado o no. Devolveremos una cadena de texto si se ha
     * podido realizar el cambio o no.
     *
     * @param id es el id del local que vamos a alquilar.
     * @return devolverá un String que indicará si se ha podido alquilar el
     * local.
     */
    public String alquilarLocal(String id) {
        return "";

    }

    /**
     * Con este método lo que haremos será rescindir el contrato de alquiler del
     * local. Verificaremos si este local está alquilado o no. Devolveremos una
     * cadena de texto si se ha podido realizar el cambio o no.
     *
     * @param id es el id del local que vamos a alquilar.
     * @return devolverá un String que indicará si se ha podido rescindir el
     * contrato de alquiler.
     */
    public String rescindirContrato(String id) {
        return "";
    }

    public int verDisponibles() {
        return 0;
    }

    public String listado() {
        return "";
    }

}

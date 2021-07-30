package com.centrocomercial.clases;

import com.centrocomercial.interfaces.IReparaciones;

/**
 *
 * @author Dani
 */
public class Locales extends Edificio  implements IReparaciones {

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
        return "ID: "+super.getId() + " || Local: " + tipoLocal + " || area: " + area + "m\u00B2 || capacidad: " + capacidad + " personas || Planta: " + numeroPlanta;
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
               String resultado = "";

        if (super.isDisponible()) {

            super.setDisponible(false);

            resultado = "El local con id " + id + " se ha alquilado.";

        } else {

            resultado = "El local " + id + " ya está alquilado, no se ha "
                    + "realizado ninguna acción adicional.";

        }

        return resultado;

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
         String resultado = "";

        if (!super.isDisponible()) {

            super.setDisponible(true);

            resultado = "Se ha rescindido con éxito el contrato de alquiler del "
                    + "local: " + id + ".";

        } else {

            resultado = "El local " + id + " ya estaba disponible, no se ha "
                    + "realizado ninguna acción adicional.";

        }

        return resultado;
    }
    
    
    
    /**
     * Método que sobreescribe el método de la interfaz IReparaciones que
     * servirá para llamar al equipo de mantenimiento y realizar las
     * reparaciones oportunas.
     *
     * @param id identifica el id del local
     */
    
    @Override
    public String reparar(String id) {

        return "Se ha llamado al equipo de mantenimiento para realizar las "
                + "reparaciones oportunas en el local " + id + ".";    
    }
    
    
    /**
     * Método que sobreescribe el método de la interfaz IReparaciones que
     * servirá para llamar al equipo de limpieza.
     *
     * @param id identifica el id del local
     */
    
    @Override
    public String limpiar(String id) {
                
        return "Se ha llamado al equipo de limpieza para limpiar el local " + id + ".";
    }

    
      @Override
    public String horarioApertura() {
        return "El horario de apertura de los locales es: " + super.getHorarioApertura() + " a " + super.getHorarioCierre();

    }
    
    
        public String indicativoLugar(String id) {
        String enPlanta = "estas en los locales de la planta " + this.numeroPlanta;
        if (numeroPlanta < 0) {
            enPlanta = "Estás en los locales del parking ";
        }

        return enPlanta;
    }
}

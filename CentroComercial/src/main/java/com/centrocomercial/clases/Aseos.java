package com.centrocomercial.clases;

/**
 * @author Ana
 */

import com.centrocomercial.clases.Edificio;
import com.centrocomercial.interfaces.IControl;
import com.centrocomercial.interfaces.IReparaciones;

public class Aseos extends Edificio implements IReparaciones, IControl {

    private int planta;
    private int capacidad;
    private boolean limpio;

    public Aseos() {
    }

    public Aseos(int planta, int capacidad, boolean limpio, String id, String horarioApertura, String horarioCierre, boolean disponible, boolean abierto, int numeroPlantas) {
        super(id, horarioApertura, horarioCierre, disponible, abierto, numeroPlantas);
        this.planta = planta;
        this.capacidad = capacidad;
        this.limpio = limpio;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    
    @Override
    public String toString() {
        return "Aseos{" + "planta=" + planta + ", capacidad=" + capacidad + ", limpio=" + limpio + '}';
    }
    
    
    /**
     * Método que nos indica que los aseos están surtidos del material necesario
     * para la utilización de los clientes.
     * 
     * @return String , nos devuelve un String indicándonos qué es lo que se ha hecho.
     * 
     */
    public String rellenar() {
        return "El aseo está surtido de papel higiénico, se han vaciado las papeleras y rellenado los dispensadores de jabón.\n";

    }
    
    
    /**
     * Método solicitarLimpieza que nos dice si es necesaria o no la limpieza del aseo
     * mediante la variable de clase de tipo boolean limpio.
     * 
     * @return nos devolverá un String.
     */
    public String solicitarLimpieza() {

        return "Solicitada limpieza del aseo.";
    }

    /**
     * @Override
     * Método que nos indica que se abre el paso a la zona en la que nos encontramos.
     * 
     * @param id , que solicita el id de los aseos, en este caso.
     * 
     * @return una cadena de caracteres indicando que se ha abierto el paso.
     */
    @Override
    public String abrirPaso(String id) {
        String retorno = "";
        if (!super.isAbierto()) {
            super.setAbierto(true);
            retorno = " Se ha abierto el paso al aseo " + id;
        } else
            retorno = "El aseo ya está abierto";
        
        return retorno;
    }

 
    /**
     * @Override
     * Método que nos indica que se cierra el paso a la zona en la que nos encontramos.
     * 
     * @param id , que solicita el id de los aseos, en este caso.
     * 
     * @return una cadena de caracteres indicando que se ha cerrado el paso.
     */
    @Override
    public String cerrarPaso(String id) {
        String retorno = "";
        if (super.isAbierto()) {
            super.setAbierto(false);
            retorno = " Se ha cerrado el paso al aseo " + id;
        } else
            retorno = "El aseo ya está cerrado";
        
        return retorno;
    }

    /**
     * @Override
     * Método que nos aporta un control de personas en la zona en la que nos
     * encontramos.
     * 
     * @param id , que solicita el id de los aseos, en este caso.
     * 
     * @return una cadena de caracteres indicando la capacidad en los aseos.
     */
    @Override
    public int controlPersonas(String id) {
        
        return (int) (Math.random() * 20);
    }

    @Override
    /**
     * Método que sobreescribe el método de la interfaz IReparaciones que
     * servirá para llamar al equipo de mantenimiento y realizar las
     * reparaciones oportunas.
     * 
     * @param id identifica el id del local
     */
    
    public String reparar(String id) {

        return "Se ha llamado al equipo de mantenimiento para realizar las "
                + "reparaciones oportunas en el aseo " + id + ".";
    }

    @Override
    /**
     * Método que sobreescribe el método de la interfaz IReparaciones que
     * servirá para llamar al equipo de limpieza.
     *
     * @param id identifica el id del local
     */
    public String limpiar(String id) {
        limpio = false;
        String retorno = "";
        if (!limpio)
            retorno = "Se ha llamado al equipo de limpieza para limpiar el aseo " + id + ".";
        
        return retorno;
    }


    /**
     * Metodo heredado de la clase padre que nos indica el horario de apertura,
     * en este caso, de los aseos.
     * 
     * @return String indicandonos el horario de apertura a cierre.
     */
    @Override
    public String horarioApertura() {
        return "El horario de apertura de los aseos es: " + super.getHorarioApertura() + " a " + super.getHorarioCierre();

    }
/**
 * Método que nos indicará en que aseos estamos según la planta en que nos
 * encontremos en el centro comercial.
 * 
 * @param id para indicar el indicativo del aseo
 * 
 * @return String con los datos oportunos segun la planta. 
 */
    public String indicativoLugar(String id) {
        String enPlanta = "estas en los aseos de la planta " + this.planta;
        if (planta < 0) {
            enPlanta = "Estás en los aseos del parking ";
        }

        return enPlanta;
    }
}

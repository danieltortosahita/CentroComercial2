/*
 * Esta clase será utilizada para controlar los accesos al centro comercial
 */
package com.centrocomercial.clases;

import com.centrocomercial.interfaces.IControl;
import com.centrocomercial.interfaces.IReparaciones;

/**
 *
 * @author José Carlos Cruzado
 */
public class Accesos extends Edificio implements IReparaciones, IControl {
    
    private int numeroPlanta;
    private String tipoAcceso;
    private boolean vigilado;
    
    public Accesos() {
    }

    public Accesos(int numeroPlanta, String tipoAcceso, boolean vigilado, String id, String horarioApertura, String horarioCierre, boolean disponible, boolean abierto, int numeroPlantas) {
        super(id, horarioApertura, horarioCierre, disponible, abierto, numeroPlantas);
        this.numeroPlanta = numeroPlanta;
        this.tipoAcceso = tipoAcceso;
        this.vigilado = vigilado;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public String getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(String tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public boolean isVigilado() {
        return vigilado;
    }

    public void setVigilado(boolean vigilado) {
        this.vigilado = vigilado;
    }

    @Override
    public String toString() {
        return "Accesos{" + "id=" + getId() + "numeroPlanta=" + numeroPlanta + "horarioApertura= " + getHorarioApertura() + "horarioCierre= " + getHorarioCierre() + ", tipoAcceso=" + tipoAcceso + ", vigilado=" + vigilado + '}';
    }

    
    
    @Override
    public String reparar(String id) {
        return "Se ha llamado al equipo de mantenimiento para realizar las "
                + "reparaciones oportunas en el acceso " + id + ".";    }

    @Override
    public String limpiar(String id) {
        
        return "Se ha llamado al equipo de limpieza para limpiar el acceso " + id + ".";
    }

    @Override
    public String abrirPaso(String id) {
        String retorno = "";
        if (!super.isAbierto()) {
            super.setAbierto(true);
            retorno = " Se ha abierto el paso al acceso " + id;
        } else
            retorno = "El acceso ya está abierto";
        
        return retorno;
    }

    @Override
    public String cerrarPaso(String id) {
        String retorno = "";
        if (super.isAbierto()) {
            super.setAbierto(false);
            retorno = " Se ha cerrado el paso al acceso " + id;
        } else
            retorno = "El acceso ya está cerrado";
        
        return retorno;
    }

    @Override
    public int controlPersonas(String id) {
        return (int) (Math.random() * 20);
    }

    public String llamarVigilancia (String id) {
        return "El servicio de Vigilancia ha sido avisado para el acceso " + id;
    }
    
    public String llamarEmergencias (String id) {
        return "El servicio de Emergencias llegará en breve al acceso " + id;
    }
    
    @Override
    public String horarioApertura() {
        return "El horario de apertura es de " + getHorarioApertura() + " a " +  getHorarioCierre() + " del acceso " + this.getId();
    }
    
    public String indicativoLugar(String id) {
        String enPlanta = "estas en los accesos de la planta " + this.numeroPlanta;
        if (this.numeroPlanta < 0) {
            enPlanta = "Estás en los accesos del parking ";
        }

        return enPlanta;
    }
}

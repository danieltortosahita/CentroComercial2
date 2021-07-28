/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centrocomercial.clases;

/**
 *
 * @author Dani
 */
public class Edificio {

    private String id, horarioApertura, horarioCierre;
    private boolean disponible, abierto;
    private int numeroPlantas;

    public Edificio() {
    }

    public Edificio(String id, String horarioApertura, String horarioCierre, boolean disponible, boolean abierto, int numeroPlantas) {
        this.id = id;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.disponible = disponible;
        this.abierto = abierto;
        this.numeroPlantas = numeroPlantas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    @Override
    public String toString() {
        return "Edificio{" + "id=" + id + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + ", disponible=" + disponible + ", abierto=" + abierto + ", numeroPlantas=" + numeroPlantas + '}';
    }

    public String horarioApertura() {
        return "";
    }

    public String indicativoLugar() {
        return "";
    }
}

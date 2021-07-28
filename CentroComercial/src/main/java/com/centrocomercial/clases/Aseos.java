/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centrocomercial.clases;

/**
 *
 * @author 
 */
public class Aseos extends Edificio {

  
    private int planta;
    private int capacidad;
    private boolean limpio;

    public Aseos() {
    }

    public Aseos(int planta, int capacidad, boolean limpio) {
        this.planta = planta;
        this.capacidad = capacidad;
        this.limpio = limpio;
    }
    
    
    
    
}

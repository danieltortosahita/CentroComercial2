/**
 *Paquete específico para las interface del proyecto centroComercial.java
 */
package com.centrocomercial.interfaces;

/**
 *
 * @author
 */
public interface IControl {

    /**
     *
     * @param id de la superficie del centro comercial en la que nos encontremos
     * @return nos devuelve valor de tipo String.
     */
    public String abrirPaso(String id);

    /**
     *
     * @param id de cada superficie del centro comercial en la que nos
     * encontremos
     * @return nos devuelve un valor de tipo String.
     */
    public String cerrarPaso(String id);

    /**
     *
     * @param id de cada superficie del centro comercial
     * @return nos devulve un valor entero para indicar el control de personas
     * que hay en ese lugar concreto.
     */
    public int controlPersonas(String id);
}

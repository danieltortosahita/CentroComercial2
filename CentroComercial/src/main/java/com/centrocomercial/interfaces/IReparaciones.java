/*
 * Paquete específico para las interface del proyecto centroComercial.java
 */
package com.centrocomercial.interfaces;

/**
 * Interface IReparaciones de la que implementarán las clases hijas de la clase
 * padre Edificio.
 */
public interface IReparaciones {

    /**
     * @param id de cada superficie del centro comercial ya sea local, aseo,
     * acceso o parking.
     * @return nos devuelve un valor de tipo String.
     */
    public String reparar(String id);

    /**
     * @param id de cada superficie del centro comercial ya sea local, aseo,
     * acceso o parking.
     * @return nos devuelve un valor de tipo String.
     */
    public String limpiar(String id);
}

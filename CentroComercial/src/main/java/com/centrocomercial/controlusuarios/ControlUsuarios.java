/*
 * Esta clase será utilizada para controlar la creación y acceso de usuarios
 * a la aplicación.
 */

package com.centrocomercial.controlusuarios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author José Carlos
 */
public class ControlUsuarios {
    
        
    private HashMap <String, String> usuarios = new HashMap();
    
    
    /**
     * Este método sirve para añadir a un nuevo usuario
     * @param nombre Es un argumento tipo String con el nombre del usuario
     * @param pass Es un argumento tipo String con la contraseña del usuario
     * @return True o False, dependiendo de si ha podido o no añadir al usuario
     */
    public boolean addUsuario (String nombre, String pass) {
        int tamanioAntiguo = usuarios.size();
        usuarios.put(nombre, pass);
        if (tamanioAntiguo == (usuarios.size() - 1))
            return true;
        else
            return false;
    }
    
    
    /**
     * Este método sirve para comprobar en el HashMap que el usuario está dado de alta
     * @param nombre Argumento tipo String con el nombre del usuario
     * @param pass Argumento tipo String con la contraseña del usuario
     * @return True o False, dependiendo de si está en el HashMap o no
     */
    public boolean checkUsuario (String nombre, String pass) {
        boolean accesoPermitido = false;
        
        for (Map.Entry<String, String> entry : usuarios.entrySet()) {
            if ((nombre.equals(entry.getKey())) && (pass.equals(entry.getValue())))
                accesoPermitido = true;
        }
        
        return accesoPermitido;
    }
}

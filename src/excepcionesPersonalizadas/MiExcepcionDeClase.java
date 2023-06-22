/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author brick
 */
public class MiExcepcionDeClase extends Exception {
    private final static String MENSAJE=""
            + "La clase no ha sido encontrada. ";
           
    public MiExcepcionDeClase() {
        //Super llama al constructor de la superclase o clase padre 
        super(MENSAJE);
    }
}

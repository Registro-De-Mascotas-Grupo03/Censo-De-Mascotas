/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Fabricio
 */
public class MiExcepcionDeEscritura extends Exception{
    private final static String MENSAJE=""
            + "Hubo un error al intentar manipular el archivo";
           
    public MiExcepcionDeEscritura() {
        //Super llama al constructor de la superclase o clase padre 
        super(MENSAJE);
    }
}

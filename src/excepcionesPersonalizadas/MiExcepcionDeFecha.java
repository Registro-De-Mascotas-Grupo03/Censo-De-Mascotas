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
public class MiExcepcionDeFecha extends Exception  {
    private final static String MENSAJE=""
            + "Error de conversión de texto a fecha, ingresa un "
            + "texto que contenga el formato de fecha --> DD/MM/YYYY";
    public MiExcepcionDeFecha() {
        //Super llama al constructor de la superclase o clase padre 
        super(MENSAJE);
    }
}

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
public class MiExcepcionNula extends Exception {
    private final static String MESSAGE=""
            + "Wow, parece que no existe un dueño enlazado al numero de "
            + "documento que ingresaste, por favor revisa de nuevo. ";

    public MiExcepcionNula() {
        super(MESSAGE);
    }
    
    
    
}

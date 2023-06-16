/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betatester;

import entidades.Dueño;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameIngresar;

/**
 *
 * @author tokiro
 */
public class BetaTester {

    /**
     * @param args the command line arguments
     */
    public static List<Dueño> dueños= new ArrayList<>();
    public static List<Mascota> mascotas = new ArrayList<>();
    public static void main(String[] args) {
        
        JFrameIngresar ingresar = new JFrameIngresar();
        ingresar.setLocationRelativeTo(null);
        ingresar.setVisible(true);
        
    }
    
}

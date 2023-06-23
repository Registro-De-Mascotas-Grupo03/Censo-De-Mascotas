/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betatester;

import entidades.Dueño;
import entidades.Mascota;
import entidades.Multa;
import entidades.Usuario;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import funciones.Utilitario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Multa> multas = new ArrayList<>();
    
    public static void main(String[] args) {
        try {
            Utilitario.leerDueñosEnArchivo("Dueños.txt");
        } catch (MiExcepcionDeEscritura e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (MiExcepcionDeArchivo e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (MiExcepcionDeClase e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        Usuario usuario = new Usuario("Admin", "123456");
        usuario.setRol("Administrador");       
        usuarios.add(usuario);
        usuario.setNombre("");
        usuario.setNumDoc("");
        
        usuario = new Usuario("Trabajador", "123");
        usuario.setRol("Operador");
        usuario.setNombre("");
        usuario.setNumDoc("");
        usuario.setCorreoPersonal("piconm17@gmail.com");
        usuarios.add(usuario);
        JFrameIngresar ingresar = new JFrameIngresar();
        ingresar.setLocationRelativeTo(null);
        ingresar.setVisible(true);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import entidades.Dueño;
import entidades.Mascota;
import excepcionesPersonalizadas.MiExcepcionDeFecha;
import excepcionesPersonalizadas.MiExcepcionNula;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class Utilitario {
    //Funcion que permite convertir una cadena de texto a una fecha
    public static LocalDate convertirAFecha(String numeroEnTexto)
            throws MiExcepcionDeFecha {
        try {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(numeroEnTexto,date);
        } catch (DateTimeParseException s) {
            throw new MiExcepcionDeFecha();


        }

    }
    
   
    public static List<Mascota> obtenerLista(Dueño dueño)
            throws MiExcepcionNula {
        try {
            return dueño.getMascotas();
        } catch (NullPointerException s) {
            throw new MiExcepcionNula();

        }
        

    }
}

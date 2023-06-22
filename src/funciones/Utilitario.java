/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import betatester.BetaTester;
import entidades.Dueño;
import entidades.Mascota;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import excepcionesPersonalizadas.MiExcepcionDeFecha;
import excepcionesPersonalizadas.MiExcepcionNula;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            return LocalDate.parse(numeroEnTexto, date);
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

    public static void crearArchivo(String nombreArchivo)
            throws MiExcepcionDeArchivo {

        try {
            FileOutputStream archivo = new FileOutputStream("archivos\\" + nombreArchivo);

        } catch (FileNotFoundException ex) {
            throw new MiExcepcionDeArchivo();
        }
    }

    public static void escribirDueñosEnArchivo(String nombreArchivo,
            List<Dueño> dueños)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura {

        try {
            FileOutputStream archivo = new FileOutputStream("archivos\\" + nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(dueños);
            salida.close();
            archivo.close();
        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        }
    }

    public static void leerDueñosEnArchivo(String nombreArchivo)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura,
            MiExcepcionDeClase {

        try {
            FileInputStream archivo = new FileInputStream("archivos\\" + nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            BetaTester.dueños = (List<Dueño>) entrada.readObject();
            entrada.close();
            archivo.close();

        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        } catch (ClassNotFoundException ex) {
            throw new MiExcepcionDeClase();
        }
    }
}

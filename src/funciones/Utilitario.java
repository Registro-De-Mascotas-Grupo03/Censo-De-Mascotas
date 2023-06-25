/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import betatester.BetaTester;
import entidades.Dueño;
import entidades.Mascota;
import entidades.Multa;
import entidades.Usuario;
import excepcionesPersonalizadas.MiExcepcionDeArchivo;
import excepcionesPersonalizadas.MiExcepcionDeClase;
import excepcionesPersonalizadas.MiExcepcionDeEscritura;
import excepcionesPersonalizadas.MiExcepcionDeFecha;
import excepcionesPersonalizadas.MiExcepcionNula;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
            throws MiExcepcionDeArchivo,MiExcepcionDeEscritura {

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
    public static void escribirMascotasEnArchivo(String nombreArchivo,
            List<Mascota> mascotas)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura {

        try {
            FileOutputStream archivo = new FileOutputStream("archivos\\" + nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(mascotas);
            salida.close();
            archivo.close();
        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        }
    }

    public static void leerMascotasEnArchivo(String nombreArchivo)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura,
            MiExcepcionDeClase {

        try {
            FileInputStream archivo = new FileInputStream("archivos\\" + nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            BetaTester.mascotas = (List<Mascota>) entrada.readObject();
            entrada.close();
            archivo.close();

        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        } catch (ClassNotFoundException ex) {
            throw new MiExcepcionDeClase();
        }
    }
     public static void escribirMultasEnArchivo(String nombreArchivo,
            List<Multa> multas)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura {

        try {
            FileOutputStream archivo = new FileOutputStream("archivos\\" + nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(multas);
            salida.close();
            archivo.close();
        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        }
    }

    public static void leerMultasEnArchivo(String nombreArchivo)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura,
            MiExcepcionDeClase {

        try {
            FileInputStream archivo = new FileInputStream("archivos\\" + nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            BetaTester.multas = (List<Multa>) entrada.readObject();
            entrada.close();
            archivo.close();

        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        } catch (ClassNotFoundException ex) {
            throw new MiExcepcionDeClase();
        }
    }
    public static void escribirUsuariosEnArchivo(String nombreArchivo,
            List<Usuario> usuarios)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura {

        try {
            FileOutputStream archivo = new FileOutputStream("archivos\\" + nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(usuarios);
            salida.close();
            archivo.close();
        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        }
    }

    public static void leerUsuariosEnArchivo(String nombreArchivo)
            throws MiExcepcionDeArchivo, MiExcepcionDeEscritura,
            MiExcepcionDeClase {

        try {
            FileInputStream archivo = new FileInputStream("archivos\\" + nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            BetaTester.usuarios = (List<Usuario>) entrada.readObject();
            entrada.close();
            archivo.close();

        } catch (IOException ex) {
            throw new MiExcepcionDeEscritura();
        } catch (ClassNotFoundException ex) {
            throw new MiExcepcionDeClase();
        }
    }
}

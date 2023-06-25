/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class Dueño extends Persona
               implements Serializable {

    

    
      
    private String sexo;
    private int edad;
    private LocalDate fecNac;
    private List<Mascota> mascotas= new ArrayList<>();
    private List<Multa> multas =new ArrayList<>();
    
    //public String toString(){
        //return this.getNumDoc()+this.getNombre()+this.getApellido()+
          //      this.getDireccion()+this.getCorreoPersonal()+
            //    String.valueOf(this.getEdad())
              //  +this.getSexo()+String.valueOf(this.getFecNac())
                //+this.getTelefono()+this.getTipoDoc()+this.getEstado()+
                //+this.get
    //}
    /**
     * @return the mascotas
     */
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * @param mascotas the mascotas to set
     */
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * @return the multas
     */
    public List<Multa> getMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
     /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * @return the fecNac
     */
    public LocalDate getFecNac() {
        return fecNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }
    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

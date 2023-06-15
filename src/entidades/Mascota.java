/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author MIKI
 */
public class Mascota {
    
    //private Dueño dueño;
    //PRUEBAS
    private String codigo;
    private String nombre;
    private String apellido;
    private String fecNac;
    private String sexo;
    private String especie;
    private String raza;
    private String dniDueño;

    //hgvhg
    
    /**
     * @return the codigo
     */
    public String getDatosEnCadena() {
        return "Codigo: " + codigo +
                "| DNI Dueño: " + dniDueño +
                "| Nombre: " + nombre +
                "| Apellido: " + apellido +
                "| FecNac.: " + fecNac +
                "| Sexo: " + sexo +
                "|Especie: " + especie +
                "|Raza: " + raza;
    }
    public String getNombreMascota(){
        
        return "Codigo: "+codigo+
                "| DNI Dueño: "+dniDueño+
                "| Nombre: "+nombre+
                "| Apellido: "+apellido+
                "| FecNac.: "+fecNac+
                "| Sexo: "+sexo+
                "|Especie: "+especie+
                "|Raza: "+raza;
    }
    public Object[][] getDatosEnTabla(){
        Object [][]data = {
            {codigo, dniDueño, nombre, apellido, fecNac, sexo, especie, raza}
        };
        return data;
    }
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecNac
     */
    public String getFecNac() {
        return fecNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
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
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getDniDueño() {
        return dniDueño;
    }

    public void setDniDueño(String dniDueño) {
        this.dniDueño = dniDueño;
    }
    
}

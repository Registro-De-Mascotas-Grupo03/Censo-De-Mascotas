/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;



/**
 *
 * @author tokiro
 */
public class Usuario extends Persona{

    public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    private Usuario supervisor;
    private String rol;
    private String usuario;
    private String contraseña;
    private String contraseña2;

    public Usuario( String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    
    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    /*public Usuario(String tipoDoc, String numDoc, String nombre, String apellido, LocalDate fecNac, int edad, String direccion, String correoPersonal, String telefono, String estado, String rol, String usuario, String contraseña, String contraseña2) {
        super(tipoDoc, numDoc, nombre, apellido, fecNac, edad, direccion, correoPersonal, telefono, estado);    
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.contraseña2 = contraseña2;
    }*/

    /*public Object[][] getDatosEnTabla(){
        Object [][]data = {
            {getTipoDoc(), getNombre(), getApellido(), getCorreoPersonal(), getDireccion()}
        };
        return data;
    }*/

   
    

    /*public String getDatosEnCadena() {
        return  getSupervisor() + getNumDoc() + getNombre() +getApellido() +
                  getCorreoPersonal() +getDireccion();
    }*/
    
    
   

    /*public String getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }


    public Usuario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Usuario supervisor) {
        this.supervisor = supervisor;
    }*/

    

}

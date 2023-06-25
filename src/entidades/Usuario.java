/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author Fabricio
 */
public class Usuario extends Persona
        implements Serializable {

    
    private Usuario supervisor;
    private String rol;
    private String usuario;
    private String contraseña;
    private String contraseña2;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    /**
     * @return the supervisor
     */
    public Usuario getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Usuario supervisor) {
        this.supervisor = supervisor;
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

    /**
     * @return the contraseña2
     */
    public String getContraseña2() {
        return contraseña2;
    }

    /**
     * @param contraseña2 the contraseña2 to set
     */
    public void setContraseña2(String contraseña2) {
        this.contraseña2 = contraseña2;
    }

    

    

    
}

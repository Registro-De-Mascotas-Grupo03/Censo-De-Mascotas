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
public class Multa {
    
    private Dueño dueño;
    private Usuario usuario;
    private String codigoMulta;
    private String fechaGenerada;
    private String fechaVencimiento;
    private float monto;
    private String descripción;
    private String estado;

    public Multa(Dueño dueño, String codigoMulta, String fechaVencimiento) {
        this.dueño = dueño;
        this.codigoMulta = codigoMulta;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    /**
     * @return the propietario
     */
    public Dueño getPropietario() {
        return dueño;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Dueño propietario) {
        this.dueño = propietario;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the codigoMulta
     */
    public String getCodigoMulta() {
        return codigoMulta;
    }

    /**
     * @param codigoMulta the codigoMulta to set
     */
    public void setCodigoMulta(String codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    /**
     * @return the fechaGenerada
     */
    public String getFechaGenerada() {
        return fechaGenerada;
    }

    /**
     * @param fechaGenerada the fechaGenerada to set
     */
    public void setFechaGenerada(String fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    /**
     * @return the fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

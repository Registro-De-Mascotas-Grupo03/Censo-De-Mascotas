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
    
    private String codigoMulta; 
    private Dueño dueño; 
    private Usuario usuario;
    private String fechaGenerada; 
    private String fechaVencimiento;
    private String fechaPagado;  
    private Float monto; 
    private String descripcion;
    private String estado; 

    public Multa(Dueño dueño, Usuario usuario) {
        this.dueño = dueño;
        this.usuario = usuario;
        this.estado = "Por Pagar";
    }

    public String getDatosCadena() {
        return codigoMulta + "DNI" + "000" +//dueño.getTipoDoc + dueño.getNumDoc() +
                monto + fechaGenerada + fechaVencimiento + estado;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
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
        calcularFechaVencimiento();
    }

    /**
     * @return the fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getFechaPagado() {
        return fechaPagado;
    }

    public void setFechaPagado(String fechaPagado) {
        this.fechaPagado = fechaPagado;
    }

    /**
     * @return the monto
     */
    public Float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Float monto) {
        this.monto = monto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripción to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    private void calcularFechaVencimiento() {
        this.fechaVencimiento = String.format("%02d", Integer.parseInt(
                this.fechaGenerada.substring(0, 2))) + "/" + 
                String.format("%02d", Integer.parseInt(
                        this.fechaGenerada.substring(3, 5)) + 4) + "/" + 
                String.format("%02d", Integer.parseInt(
                        this.fechaGenerada.substring(6, 10)));
    }
    
}

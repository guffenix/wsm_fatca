
package ec.edu.espe.arquitectura.examplerest.service;

import ec.edu.espe.arquitectura.examplerest.models.USEntidad;

/**
 *
 * @author guffenix
 */
public class RSFatcaEntidad {
    private Integer codigo;
    private Integer error;
    private String descripcion;
    private USEntidad entidad;

    public RSFatcaEntidad() {
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public USEntidad getEntidad() {
        return entidad;
    }

    public void setEntidad(USEntidad entidad) {
        this.entidad = entidad;
    }
    
    
}


package ec.edu.espe.arquitectura.examplerest.models;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class Sucursal {
    
    @Property("codigo")
    private String codigo;
    
    @Property("tipo") //sucursal - agencia
    private String tipo;
    
    @Property("nombre")
    private String nombre;
    
    @Property("direccionUS")
    private String direccionUS;
    
    @Embedded
    private USPersona personaUS;
    
    public Sucursal() {
    }

    @Override
    public String toString() {
        return "Sucursal{" + "codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + nombre + ", direccionUS=" + direccionUS + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionUS() {
        return direccionUS;
    }

    public void setDireccionUS(String direccionUS) {
        this.direccionUS = direccionUS;
    }

    public USPersona getPersonaUS() {
        return personaUS;
    }

    public void setPersonaUS(USPersona personaUS) {
        this.personaUS = personaUS;
    }

}

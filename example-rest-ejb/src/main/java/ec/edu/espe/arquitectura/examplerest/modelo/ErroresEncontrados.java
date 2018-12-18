
package ec.edu.espe.arquitectura.examplerest.modelo;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class ErroresEncontrados {
    @Property("tipo")
    private String tipo;
    @Property("descripcion")
    private String descripcion;
    
    @Property("estado")
    private String estado;
    
    public ErroresEncontrados() {
    }

    @Override
    public String toString() {
        return "ErroresEncontrados{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  
    
}

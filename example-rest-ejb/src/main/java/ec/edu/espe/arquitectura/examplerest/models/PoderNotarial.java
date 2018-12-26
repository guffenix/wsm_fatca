
package ec.edu.espe.arquitectura.examplerest.models;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class PoderNotarial {
    
    @Property("codigo")
    private String codigo;
    
    @Property("tipo")
    private String tipo;
    
    @Property("nombre")
    private String nombre;
    
    @Property("estado")
    private String estado;
    
    @Embedded
    private AutoridadCompetente autoridadCompetente;
    
    public PoderNotarial() {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AutoridadCompetente getAutoridadCompetente() {
        return autoridadCompetente;
    }

    public void setAutoridadCompetente(AutoridadCompetente autoridadCompetente) {
        this.autoridadCompetente = autoridadCompetente;
    }
  
    
}

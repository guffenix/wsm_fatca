 
package ec.edu.espe.arquitectura.examplerest.modelo;

import java.util.Date;
import java.util.List;
//import java.util.List;
//import java.util.Objects;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
//import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Entity(noClassnameStored = true, value="pruebas")
public class Pruebas {
    
    @Id
    private ObjectId id;
    
    @Property("fechaPlanificadaInicio")
    @Indexed(options = @IndexOptions(name = "idx", unique = true))
    private Date fechaPlanificadaInicio;
    
    @Property("fechaInicioReal")
    private Date fechaInicioReal;
    
    @Property("fechaAprobacion")
    private Date fechaAprobacion;
    
    @Property("estado")
    private String estado;
    
     @Embedded
    private List<ErroresEncontrados> erroresEncontrados;
   

    public Pruebas() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFechaPlanificadaInicio() {
        return fechaPlanificadaInicio;
    }

    public void setFechaPlanificadaInicio(Date fechaPlanificadaInicio) {
        this.fechaPlanificadaInicio = fechaPlanificadaInicio;
    }

    public Date getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(Date fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ErroresEncontrados> getErroresEncontrados() {
        return erroresEncontrados;
    }

    public void setErroresEncontrados(List<ErroresEncontrados> erroresEncontrados) {
        this.erroresEncontrados = erroresEncontrados;
    }

   
    
}

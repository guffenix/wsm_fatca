 
package ec.edu.espe.arquitectura.examplerest.models;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Entity(noClassnameStored = true, value="USEntidad")
public class USEntidad {
    
    @Id
    private ObjectId id;
    
    @Property("identificacion")
    @Indexed(options = @IndexOptions(name = "identificacion", unique = true))
    private String identificacion;
    
    @Property("nombre")
    private String nombre;
    
    @Property("codigo")
    private String codigo;
    
    @Property("tipo") //sociedad colectiva, sociedad anónima, compañía, o asociación
    private String tipo;
    
    @Property("razonSocial")
    private String razonSocial;
    
    @Property("direccion")
    private String direccion;
    
    @Property("telefono")
    private String telefono;
    
    @Property("fechaRegistro")
    private Date fechaRegistro;
    
    @Property("estado")
    private Boolean estado;
    
    @Embedded
    private List<Sucursal> sucursal;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

}

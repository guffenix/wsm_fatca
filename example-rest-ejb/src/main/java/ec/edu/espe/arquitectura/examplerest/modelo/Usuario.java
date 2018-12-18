 
package ec.edu.espe.arquitectura.examplerest.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;
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
@Entity(noClassnameStored = true, value="usuario")
public class Usuario {
    
    @Id
    private ObjectId id;
    
    @Property("codigoUsuario")
    @Indexed(options = @IndexOptions(name = "idx", unique = true))
    private String codigoUsuario;
    
    @Property("clave")
    private String clave;
    
    @Property("intentosFallidos")
    private Integer intentosFallidos;
    
    @Property("fechaNacimiento")
    private Date fechaNacimiento;

    @Embedded
    private List<Telefono> telefonos;
    public ObjectId getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.codigoUsuario);
        return hash;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", codigoUsuario=" + codigoUsuario + ", clave=" + clave + ", intentosFallidos=" + intentosFallidos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.codigoUsuario, other.codigoUsuario)) {
            return false;
        }
        return true;
    }

    public Usuario() {
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(Integer intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    
}

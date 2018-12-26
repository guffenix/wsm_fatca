 
package ec.edu.espe.arquitectura.examplerest.models;

import ec.edu.espe.arquitectura.examplerest.modelo.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class USPersona {

    
    @Property("identificacion")
    private String identificacion;
    
    @Property("nacionalidad")
    private String nacionalidad;
    
    @Property("tipo") //natural juridica    
    private String tipo;
    
    @Property("numeroTelefono")
    private String numeroTelefono;
    
    @Property("instruccionPermanente")
    private String instruccionPermanente;
    
    @Property("fechaNacimiento")
    private Date fechaNacimiento;
    
    @Embedded
    private LugarNacimiento lugarNacimiento;
    
    @Embedded
    private PoderNotarial poderNotarial;

    @Embedded
    private List<Telefono> telefonos;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.identificacion);
        return hash;
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
        final USPersona other = (USPersona) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "USPersona{" + "identificacion=" + identificacion + ", nacionalidad=" + nacionalidad + ", tipo=" + tipo + ", numeroTelefono=" + numeroTelefono + ", instruccionPermanente=" + instruccionPermanente + ", fechaNacimiento=" + fechaNacimiento + ", lugarNacimiento=" + lugarNacimiento + ", poderNotarial=" + poderNotarial + ", telefonos=" + telefonos + '}';
    }
    
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LugarNacimiento getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(LugarNacimiento lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getInstruccionPermanente() {
        return instruccionPermanente;
    }

    public void setInstruccionPermanente(String instruccionPermanente) {
        this.instruccionPermanente = instruccionPermanente;
    }

    public PoderNotarial getPoderNotarial() {
        return poderNotarial;
    }

    public void setPoderNotarial(PoderNotarial poderNotarial) {
        this.poderNotarial = poderNotarial;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

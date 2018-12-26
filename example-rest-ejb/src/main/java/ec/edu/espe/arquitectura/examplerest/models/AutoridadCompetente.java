
package ec.edu.espe.arquitectura.examplerest.models;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class AutoridadCompetente {
    
    @Property("codigo")
    private String codigo;
    
    @Property("nombre")
    private String nombre;
    
    @Embedded
    private CuentaBancoComercio cuentaBancoComercio;

    public AutoridadCompetente() {
    }

    @Override
    public String toString() {
        return "AutoridadCompetente{" + "codigo=" + codigo + ", nombre=" + nombre + ", cuentaBancoComercio=" + cuentaBancoComercio + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancoComercio getCuentaBancoComercio() {
        return cuentaBancoComercio;
    }

    public void setCuentaBancoComercio(CuentaBancoComercio cuentaBancoComercio) {
        this.cuentaBancoComercio = cuentaBancoComercio;
    }

}

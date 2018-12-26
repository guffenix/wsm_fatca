
package ec.edu.espe.arquitectura.examplerest.models;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class CuentaBancoComercio {
    
    @Property("codigo")
    private String codigo;
    
    @Property("tipo")
    private String tipo;
    
    @Property("numero")
    private String numero;
    
    @Property("titular")
    private String titular;
    
    @Property("direccionPostal")
    private String direccionPostal;

    public CuentaBancoComercio() {
    }

    @Override
    public String toString() {
        return "CuentaBancoComercio{" + "codigo=" + codigo + ", tipo=" + tipo + ", numero=" + numero + ", titular=" + titular + ", direccionPostal=" + direccionPostal + '}';
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

   
    
}

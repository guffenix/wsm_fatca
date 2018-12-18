
package ec.edu.espe.arquitectura.examplerest.modelo;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author guffenix
 */
@Embedded
public class Telefono {
    @Property("tipo")
    private String tipo;
    @Property("numero")
    private String numero;

    public Telefono() {
    }

    @Override
    public String toString() {
        return "Telefono{" + "tipo=" + tipo + ", numero=" + numero + '}';
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
    
}

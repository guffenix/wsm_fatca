
package ec.edu.espe.arquitectura.examplerest.service;

/**
 *
 * @author guffenix
 */
public class RSFatca {
    
    private Integer codigo;
    private Integer error;
    private String descripcion;
    private UsrFatca usrFatca;
    

    public RSFatca() {
    }

    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UsrFatca getUsrFatca() {
        return usrFatca;
    }

    public void setUsrFatca(UsrFatca usrFatca) {
        this.usrFatca = usrFatca;
    }
        
}

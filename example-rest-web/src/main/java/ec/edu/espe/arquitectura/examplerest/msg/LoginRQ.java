
package ec.edu.espe.arquitectura.examplerest.msg;

/**
 *
 * @author guffenix
 */
public class LoginRQ {
    private String _codigoUsuario;
    private String Clave;

    @Override
    public String toString() {
        return "LoginRQ{" + "_codigoUsuario=" + _codigoUsuario + ", Clave=" + Clave + '}';
    }

    /**
     * @return the _codigoUsuario
     */
    public String getCodigoUsuario() {
        return _codigoUsuario;
    }

    /**
     * @param _codigoUsuario the _codigoUsuario to set
     */
    public void setCodigoUsuario(String _codigoUsuario) {
        this._codigoUsuario = _codigoUsuario;
    }

    /**
     * @return the Clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * @param Clave the Clave to set
     */
    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
    
}

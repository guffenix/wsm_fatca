
package ec.edu.espe.arquitectura.examplerest.modelo;


import org.mongodb.morphia.annotations.*;

/**
 *
 * @author guffenix
 */
@Embedded
public class LugarNacimiento {
    
    @Property("_Provincia")
    private String _Provincia;
    @Property("_Canton")
    private String _Canton;
    @Property("_Parroquia")
    private String _Parroquia;

    public LugarNacimiento() {
    }
    
    

    public String getProvincia() {
        return _Provincia;
    }

    public void setProvincia(String _Provincia) {
        this._Provincia = _Provincia;
    }

    public String getCanton() {
        return _Canton;
    }

    public void setCanton(String _Canton) {
        this._Canton = _Canton;
    }

    public String getParroquia() {
        return _Parroquia;
    }

    public void setParroquia(String _Parroquia) {
        this._Parroquia = _Parroquia;
    }
    
    
    
}

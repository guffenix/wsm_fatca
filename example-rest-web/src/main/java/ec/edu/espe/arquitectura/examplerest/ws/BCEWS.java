
package ec.edu.espe.arquitectura.examplerest.ws;

import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import ec.edu.espe.arquitectura.examplerest.service.BCEServiceLocal;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "BCEWS")
public class BCEWS {

    @EJB
    private BCEServiceLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerUsuario")
    public Usuario obtenerUsuario() {
        return ejbRef.obtenerUsuario();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examplerest.ws;

import ec.edu.espe.arquitectura.examplerest.models.USEntidad;
import ec.edu.espe.arquitectura.examplerest.service.FATCServiceLocal;
import ec.edu.espe.arquitectura.examplerest.service.RSFatca;
import ec.edu.espe.arquitectura.examplerest.service.RSFatcaEntidad;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "WSFATCA")
public class WSFATCA {

    @EJB
    private FATCServiceLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerEntidades")
    public List<USEntidad> obtenerEntidades() {
        return ejbRef.obtenerEntidades();
    }

    @WebMethod(operationName = "obtenerEntidadUS")
    public RSFatcaEntidad obtenerEntidadUS(@WebParam(name = "codigoEntidadUS") String codigoEntidadUS) {
        return ejbRef.obtenerUSEntidad(codigoEntidadUS);
    }

    @WebMethod(operationName = "obtenerPersonaUSPorCedula")
    public RSFatca obtenerPersonaUSPorCedula(@WebParam(name = "cedula") String cedula) {
        return ejbRef.usPersonaPorCedula(cedula);
    }
    
    @WebMethod(operationName = "obtenerPersonaUSPorNombre")
    public RSFatca obtenerPersonaUSPorNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.usPersonaPorNombre(nombre);
    }
}

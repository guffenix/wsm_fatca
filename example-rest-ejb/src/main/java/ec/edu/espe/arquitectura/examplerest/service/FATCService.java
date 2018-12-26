
package ec.edu.espe.arquitectura.examplerest.service;

import ec.edu.espe.arquitectura.examplerest.dao.DAOConsultas;
import ec.edu.espe.arquitectura.examplerest.models.USEntidad;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class FATCService implements FATCServiceLocal {

    @Override
    public List<USEntidad> obtenerEntidades(){
        return DAOConsultas.obtenerTodos();
    }
    
    @Override
    public RSFatcaEntidad obtenerUSEntidad(String cedula){
        return DAOConsultas.obtenerUSEntidad(cedula);
    }
    

    @Override
    public RSFatca usPersonaPorNombre(String nombre) {
        return DAOConsultas.personaUSPorNombre(nombre);
    }

    @Override
    public RSFatca usPersonaPorCedula(String cedula) {
        return DAOConsultas.personaUSPorCedula(cedula);
    }
    
}

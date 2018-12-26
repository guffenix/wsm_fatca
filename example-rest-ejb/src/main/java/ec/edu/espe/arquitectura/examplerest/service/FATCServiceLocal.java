
package ec.edu.espe.arquitectura.examplerest.service;

import ec.edu.espe.arquitectura.examplerest.models.USEntidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guffenix
 */
@Local
public interface FATCServiceLocal {
    public  List<USEntidad> obtenerEntidades();
    public RSFatcaEntidad obtenerUSEntidad(String cedula);
    public RSFatca usPersonaPorNombre(String nombre);
    public RSFatca usPersonaPorCedula(String cedula);
}

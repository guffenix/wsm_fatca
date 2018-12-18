
package ec.edu.espe.arquitectura.examplerest.api;

import ec.edu.espe.arquitectura.examplerest.Prueba;
import ec.edu.espe.arquitectura.examplerest.modelo.Estudiante;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author guffenix
 */
@Path("Estudiante")
@RequestScoped
public class EstudianteResource {

    @Context
    private UriInfo context;
    @EJB
    private Prueba sb;

    /**
     * Creates a new instance of EstudianteResource
     */
    public EstudianteResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.arquitectura.examplerest.api.EstudianteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
       Estudiante est=new Estudiante();
       est.setCedula("1213124");
       est.setDireccion("werrsgdrh");
       est.setNombre("Rolando");
       return Response.ok(est).build();
    }

    /**
     * PUT method for updating or creating an instance of EstudianteResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

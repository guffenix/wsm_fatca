package ec.edu.espe.arquitectura.examplerest.api;

import ec.edu.espe.arquitectura.examplerest.Prueba;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author guffenix
 */
@Path("prueba")
@RequestScoped
public class PruebaResource {

    @Context
    private UriInfo context;

    @EJB
    Prueba pruebaFuncion500;

    /**
     * Creates a new instance of PruebaResource
     */
    public PruebaResource() {
    }

    @GET
    public Response getJson() {

        try {
            Integer result = pruebaFuncion500.prueba(Boolean.TRUE);

            return Response.ok(result).build();
        } catch (Exception e ) {

//            if(Response != null && Response.s.getStatus() == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
//   String serverErrorMsg = response.readEntity(String.class);
//   throw new Exception(serverErrorMsg);
//}
            return Response.serverError().entity(e.getMessage()).build();
            //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).type(MediaType.TEXT_PLAIN_TYPE).build();
        }  
    }

}


package ec.edu.espe.arquitectura.examplerest.api;

import ec.edu.espe.arquitectura.examplerest.msg.LoginRQ;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
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
@Path("login")
@RequestScoped
public class LoginResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoginResource
     */
    public LoginResource() {
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putJson(LoginRQ content) {
        System.out.println("Los datos que llegaron son: "+content.toString());
        return Response.noContent().build();
        
    }
    
    
}

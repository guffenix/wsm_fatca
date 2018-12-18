
package ec.edu.espe.arquitectura.examplerest.api;

import ec.edu.espe.arquitectura.examplerest.dao.MetodoPruebas;
import ec.edu.espe.arquitectura.examplerest.dao.Metodos;
import ec.edu.espe.arquitectura.examplerest.modelo.ErroresEncontrados;
import ec.edu.espe.arquitectura.examplerest.modelo.Pruebas;
import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.bson.types.ObjectId;

/**
 * REST Web Service
 *
 * @author guffenix
 */
@Path("Pruebas")
@RequestScoped
public class PruebasResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PruebasResource
     */
    public PruebasResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.arquitectura.examplerest.api.PruebasResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        
        GenericEntity user = MetodoPruebas.obtenerTodos();
       return Response.ok(user).build();
    }

    /**
     * PUT method for updating or creating an instance of PruebasResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putJson(Pruebas pruebas) {
        
//        Pruebas p = new Pruebas();
//        p.setEstado("INI INICIO PRUEBAS");
//        p.setFechaAprobacion(new Date());
//        p.setFechaInicioReal(new Date());
//        p.setFechaPlanificadaInicio(new Date());
//        List<ErroresEncontrados> e = new ArrayList<>();
//        ErroresEncontrados ee = new ErroresEncontrados();
//        ee.setTipo("REG");
//        ee.setEstado("REG REGISTRADO");
//        ee.setDescripcion("Error Registrado Desc.");
//        e.add(ee);
//        ee.setTipo("SOL");
//        ee.setEstado("SOL SOLUCIONADO");
//        ee.setDescripcion("Error Solucionado Desc.");
//        e.add(ee);
//        p.setErroresEncontrados(e);
        MetodoPruebas.add(pruebas);
           
        return Response.noContent().build();
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modifyJson(@PathParam("id") ObjectId id, Pruebas user) {

        Boolean estado = MetodoPruebas.modificar(id, user);
        String respuesta = "";
        if (estado) {
            respuesta = "Actualizado correctamente";
        }else{
            respuesta = "No es posible actualizar";
        }
        System.out.println(respuesta + " -> "+ id);
           
        return Response.noContent().build();
        
    }
}

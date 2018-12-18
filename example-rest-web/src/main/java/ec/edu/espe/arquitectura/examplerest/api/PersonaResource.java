
package ec.edu.espe.arquitectura.examplerest.api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.examplerest.dao.Metodos;
import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
//import java.util.List;
import javax.ws.rs.DELETE;
//import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
//import org.bson.types.ObjectId;
//import org.mongodb.morphia.*;
//import org.mongodb.morphia.query.Query;

/**
 * REST Web Service
 *
 * @author guffenix
 */
@Path("persona")
@RequestScoped
public class PersonaResource {

    @Context
    private UriInfo context;

    public PersonaResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)    
    public Response getAllJson() {

        GenericEntity user = Metodos.obtenerTodos();
       return Response.ok(user).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)    
    public Response getUnJson(@PathParam("id") String id) {

       Usuario user = Metodos.obtener(id);
       return Response.ok(user).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addJson(Usuario user) {

        Metodos.add(user);
           
        return Response.noContent().build();
        
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modifyJson(@PathParam("id") String id, Usuario user) {

        Boolean estado = Metodos.modificar(id, user);
        String respuesta = "";
        if (estado) {
            respuesta = "Actualizado correctamente";
        }else{
            respuesta = "No es posible actualizar";
        }
        System.out.println(respuesta + " -> "+ id);
           
        return Response.noContent().build();
        
    }
    
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteJson(@PathParam("id") String id) {
        System.out.println("dddddd:"+id);
        Boolean estado = Metodos.eliminar();
        String respuesta = "";
        if (estado) {
            respuesta = "Eliminado correctamente";
        }else{
            respuesta = "No es posible eliminar";
        }
        System.out.println(respuesta + " -> "+ id);
           
        return Response.noContent().build();
        
    }
//
//    public static  Usuario buscarById(String identificacion){
//        Usuario user = null;
//        final Morphia morphia = new Morphia();
//        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");
//
//        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
//        //datastore.ensureIndexes();
//        System.out.println("Conexion establecida");
//
//        //busqueda por similar
//        List<Usuario> query = datastore.createQuery(Usuario.class)
//                .field("codigoUsuario").equal(identificacion).asList();
//        if (query != null && !query.isEmpty()) {
//             user = query.get(0);
//        }
//        
//        return user;
//    }
}


package ec.edu.espe.arquitectura.examplerest.dao;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.GenericEntity;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author guffenix
 */
public class Metodos {
    public static Usuario obtener(String id){

        
        Usuario user = buscarById(id);
        if (user != null) {
            System.out.println("-> Se eliminará " + user.getCodigoUsuario());
           
        }else{
            user = new Usuario();
            System.out.println("Usuario no existe.");
        }
           
        return user;
    }
    
    public static  GenericEntity obtenerTodos(){

        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        GenericEntity usuarios = null;
        
        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por similar
        List<Usuario> query = datastore.createQuery(Usuario.class).asList();
                
        if (query != null && !query.isEmpty()) {
            usuarios = new GenericEntity<List<Usuario>>(query){};
             return usuarios;
        }else{
            query = new ArrayList<>();
            usuarios = new GenericEntity<List<Usuario>>(query){};
            return usuarios;
        }        
    }
    
    public static void add(Usuario user){
        
//        Boolean estado = Boolean.FALSE;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
        
        datastore.save(user);
           
//        return estado;
        
    }
    
    public static Boolean eliminar(){
        
        Boolean estado = Boolean.FALSE;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
        
        Usuario user = buscarById("1716497324");
        if (user != null) {
            System.out.println("-> Se eliminará " + user.getCodigoUsuario());
            datastore.delete(user);
           estado = Boolean.TRUE;
        }else{

            System.out.println("Usuario no existe.");
        }
           
        return estado;
        
    }
    
    public static Boolean modificar(String id, Usuario user) {
        
        Boolean estado = Boolean.FALSE;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
        
        Usuario usuario = buscarById(id);
        if (usuario != null) {
            System.out.println("-> Se actualizará " + user.getCodigoUsuario());
            UpdateOperations<Usuario> updateOps = datastore.createUpdateOperations(Usuario.class)
                    .set("intentosFallidos", user.getIntentosFallidos());
            datastore.update(usuario, updateOps);

            estado = Boolean.TRUE;
        }else{
            //user = new Usuario();
            System.out.println("Usuario no existe.");
        }
           
        return estado;
        
    }
    
    public static  Usuario buscarById(String identificacion){
        Usuario user = null;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por similar
        List<Usuario> query = datastore.createQuery(Usuario.class)
                .field("codigoUsuario").equal(identificacion).asList();
        if (query != null && !query.isEmpty()) {
             user = query.get(0);
        }
        
        return user;
    }
    
    
}

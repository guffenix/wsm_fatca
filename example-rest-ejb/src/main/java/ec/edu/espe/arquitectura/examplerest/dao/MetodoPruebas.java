
package ec.edu.espe.arquitectura.examplerest.dao;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.examplerest.modelo.Pruebas;
import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.GenericEntity;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author guffenix
 */
public class MetodoPruebas {
//    public static Pruebas obtener(String id){
//
//        
//        Pruebas user = buscarById(id);
//        if (user != null) {
////            System.out.println("-> Se eliminará " + user.getCodigoUsuario());
//           
//        }else{
//            user = new Pruebas();
//            System.out.println("Usuario no existe.");
//        }
//           
//        return user;
//    }
//    
    public static  GenericEntity obtenerTodos(){

        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        GenericEntity usuarios = null;
        
        final Datastore datastore = morphia.createDatastore(new MongoClient(), "Requerimiento");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por similar
        List<Pruebas> query = datastore.createQuery(Pruebas.class).asList();
                
        if (query != null && !query.isEmpty()) {
            usuarios = new GenericEntity<List<Pruebas>>(query){};
             return usuarios;
        }else{
            query = new ArrayList<>();
            usuarios = new GenericEntity<List<Pruebas>>(query){};
            return usuarios;
        }        
    }
    
    public static void add(Pruebas pruebas){
        
//        Boolean estado = Boolean.FALSE;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "Requerimiento");
        
        datastore.save(pruebas);
           
//        return estado;
        
    }
    
//    public static Boolean eliminar(){
//        
//        Boolean estado = Boolean.FALSE;
//        final Morphia morphia = new Morphia();
//        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");
//
//        final Datastore datastore = morphia.createDatastore(new MongoClient(), "Requerimiento");
//        
//        Pruebas user = buscarById("1716497324");
//        if (user != null) {
////            System.out.println("-> Se eliminará " + user.getCodigoUsuario());
//            datastore.delete(user);
//           estado = Boolean.TRUE;
//        }else{
//
//            System.out.println("Usuario no existe.");
//        }
//           
//        return estado;
//        
//    }
    
    public static Boolean modificar(ObjectId id, Pruebas user) {
        
        Boolean estado = Boolean.FALSE;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "Requerimiento");
        
        Pruebas usuario = datastore.get(Pruebas.class, id);
//        Pruebas usuario = buscarById(id);
        if (usuario != null) {
//            System.out.println("-> Se actualizará " + user.getCodigoUsuario());
            UpdateOperations<Pruebas> updateOps = datastore.createUpdateOperations(Pruebas.class)
                    
                    .set("erroresEncontrados", user.getErroresEncontrados())
                    .set("estado", user.getEstado())
                    .set("fechaInicioReal", user.getFechaInicioReal())
                    .set("fechaPlanificadaInicio", user.getFechaPlanificadaInicio());
            datastore.update(usuario, updateOps);

            estado = Boolean.TRUE;
        }else{
            //user = new Usuario();
            System.out.println("Usuario no existe.");
        }
           
        return estado;
        
    }
    
    public static  Pruebas buscarById(ObjectId identificacion){
        Pruebas user = null;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "Requerimiento");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por similar
        List<Pruebas> query = datastore.createQuery(Pruebas.class)
                .field("_id").equal("5c1308acf436a21d45230bdc").asList();
        if (query != null && !query.isEmpty()) {
             user = query.get(0);
        }
        
        return user;
    }
    
    
}


package ec.edu.espe.arquitectura.examplerest.dao;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.examplerest.models.USEntidad;
import ec.edu.espe.arquitectura.examplerest.service.RSFatca;
import ec.edu.espe.arquitectura.examplerest.service.RSFatcaEntidad;
import ec.edu.espe.arquitectura.examplerest.service.UsrFatca;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author guffenix
 */
public class DAOConsultas {
    
    public static RSFatcaEntidad obtenerUSEntidad(String codigo){

        RSFatcaEntidad resp = new RSFatcaEntidad();
        
        USEntidad usent = buscarById(codigo);
        if (usent != null) {
            System.out.println("-> ha encontrado " + usent.getCodigo());
            resp.setCodigo(202);
            resp.setError(null);
            resp.setDescripcion("Entidad US encontrada.");
            resp.setEntidad(usent);
           
        }else{
            usent = new USEntidad();
            resp.setCodigo(null);
            resp.setError(401);
            resp.setDescripcion("Entidad US NO encontrada.");
            System.out.println("Entidad US NO encontrada.");
        }
           
        return resp;
    }
    
    public static RSFatca personaUSPorCedula(String cedula){

        
        USEntidad usent = buscarByCedula(cedula);
        RSFatca resp = new RSFatca();
        if (usent != null) {
            System.out.println("-> ha encontrado " + usent.getCodigo());
            resp.setCodigo(202);
            resp.setError(null);
            resp.setDescripcion("Persona US encontrada por Cédula");
            UsrFatca usrFatca = new UsrFatca();
            
            usrFatca.setCedula(usent.getSucursal().get(0).getPersonaUS().getIdentificacion());
            usrFatca.setDireccionPostal(usent.getSucursal().get(0).getPersonaUS().getPoderNotarial().getAutoridadCompetente().getCuentaBancoComercio().getDireccionPostal());
            usrFatca.setDireccionUS(usent.getDireccion());
            usrFatca.setEntidadUS(usent.getRazonSocial());
            usrFatca.setInstruccionPermanente(usent.getSucursal().get(0).getPersonaUS().getInstruccionPermanente());
            usrFatca.setPersonaUS(usent.getNombre());
            usrFatca.setPoderNotarial(usent.getSucursal().get(0).getPersonaUS().getPoderNotarial().getNombre());
            usrFatca.setRucUS(usent.getIdentificacion());
            usrFatca.setTipoFatca(usent.getTipo());
            
            resp.setUsrFatca(usrFatca);
        }else{
            usent = new USEntidad();
            resp.setCodigo(null);
            resp.setError(401);
            resp.setUsrFatca(null);
            resp.setDescripcion("Persona US NO encontrada.");
            System.out.println("Usuario no existe.");
        }
           
        return resp;
    }
    
    
    public static RSFatca personaUSPorNombre(String nombre){

        
        USEntidad usent = buscarByNombre(nombre);
        RSFatca resp = new RSFatca();
        if (usent != null) {
            System.out.println("-> ha encontrado " + usent.getCodigo());
            resp.setCodigo(202);
            resp.setError(null);
            resp.setDescripcion("Persona US encontrada por Nombre Completo");
            
            UsrFatca usrFatca = new UsrFatca();
            
            usrFatca.setCedula(usent.getSucursal().get(0).getPersonaUS().getIdentificacion());
            usrFatca.setDireccionPostal(usent.getSucursal().get(0).getPersonaUS().getPoderNotarial().getAutoridadCompetente().getCuentaBancoComercio().getDireccionPostal());
            usrFatca.setDireccionUS(usent.getDireccion());
            usrFatca.setEntidadUS(usent.getRazonSocial());
            usrFatca.setInstruccionPermanente(usent.getSucursal().get(0).getPersonaUS().getInstruccionPermanente());
            usrFatca.setPersonaUS(usent.getNombre());
            usrFatca.setPoderNotarial(usent.getSucursal().get(0).getPersonaUS().getPoderNotarial().getNombre());
            usrFatca.setRucUS(usent.getIdentificacion());
            usrFatca.setTipoFatca(usent.getTipo());
            
            resp.setUsrFatca(usrFatca);
        }else{
            usent = new USEntidad();
            resp.setCodigo(null);
            resp.setError(401);
            resp.setDescripcion("Persona US NO encontrada.");
            resp.setUsrFatca(null);
            
            System.out.println("Usuario no existe.");
        }
           
        return resp;
    }
//    
    public static  List<USEntidad> obtenerTodos(){

        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.examplerest.models");

        List<USEntidad> usuarios = null;
        
        final Datastore datastore = morphia.createDatastore(new MongoClient(), "FATCA");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por similar
        List<USEntidad> query = datastore.createQuery(USEntidad.class).asList();
                
        if (query != null && !query.isEmpty()) {
            usuarios = (List<USEntidad>)query;
             return usuarios;
        }else{
//            query = new ArrayList<>();
//            usuarios = new GenericEntity<List<USEntidad>>(query){};
            return usuarios;
        }        
    }
    
    public static String add(USEntidad ue){
        
        String respuesta = "";
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.examplerest.models");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "FATCA");
        try {
            datastore.ensureIndexes();
            datastore.save(ue);
            respuesta = "Agregado Correctamente.";
        } catch (Exception e) {
            respuesta = "No se ha agregado correctamente.";
        }
        
        return respuesta;
                   
    }
      
    public static  USEntidad buscarById(String identificacion){
        USEntidad user = null;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.examplerest.models");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "FATCA");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por identificacion de entidad
        List<USEntidad> query = datastore.createQuery(USEntidad.class)
                .field("identificacion").equal(identificacion).asList();
        if (query != null && !query.isEmpty()) {
             user = query.get(0);
        }
        
        return user;
    }
    
    
    public static  USEntidad buscarByCedula(String identificacion){
        USEntidad user = null;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.examplerest.models");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "FATCA");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por identificacion de entidad
        List<USEntidad> query = datastore.createQuery(USEntidad.class)
                .field("sucursal.personaUS.identificacion").equal(identificacion).asList();
        if (query != null && !query.isEmpty()) {
             user = query.get(0);
        }
        
        return user;
    }
    
    public static  USEntidad buscarByNombre(String nombreCompleto){
        USEntidad user = null;
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.examplerest.models");

        final Datastore datastore = morphia.createDatastore(new MongoClient(), "FATCA");
        //datastore.ensureIndexes();
        System.out.println("Conexion establecida");

        //busqueda por identificacion de entidad
        List<USEntidad> query = datastore.createQuery(USEntidad.class)
                .field("nombre").equal(nombreCompleto).asList();
        if (query != null && !query.isEmpty()) {
             user = query.get(0);
        }
        
        return user;
    }
    
    public static USEntidad obtener(String id){

        
        USEntidad usent = buscarById(id);
        if (usent != null) {
            System.out.println("-> ha encontrado " + usent.getNombre());
           
        }else{
            usent = new USEntidad();
            System.out.println("Usuario no existe.");
        }
           
        return usent;
    }
    
     
//    public static Boolean eliminar(){
//        
//        Boolean estado = Boolean.FALSE;
//        final Morphia morphia = new Morphia();
//        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");
//
//        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
//        
//        Usuario user = buscarById("1716497324");
//        if (user != null) {
//            System.out.println("-> Se eliminará " + user.getCodigoUsuario());
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
//    
//    public static Boolean modificar(String id, Usuario user) {
//        
//        Boolean estado = Boolean.FALSE;
//        final Morphia morphia = new Morphia();
//        morphia.mapPackage("ec.edu.espe.arquitectura.taller.mongo.model");
//
//        final Datastore datastore = morphia.createDatastore(new MongoClient(), "taller");
//        
//        Usuario usuario = buscarById(id);
//        if (usuario != null) {
//            System.out.println("-> Se actualizará " + user.getCodigoUsuario());
//            UpdateOperations<Usuario> updateOps = datastore.createUpdateOperations(Usuario.class)
//                    .set("intentosFallidos", user.getIntentosFallidos());
//            datastore.update(usuario, updateOps);
//
//            estado = Boolean.TRUE;
//        }else{
//            //user = new Usuario();
//            System.out.println("Usuario no existe.");
//        }
//           
//        return estado;
//        
//    }
// 
}

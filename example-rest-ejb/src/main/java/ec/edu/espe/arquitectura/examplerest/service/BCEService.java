
package ec.edu.espe.arquitectura.examplerest.service;

import ec.edu.espe.arquitectura.examplerest.dao.Metodos;
import ec.edu.espe.arquitectura.examplerest.modelo.Telefono;
import ec.edu.espe.arquitectura.examplerest.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class BCEService implements BCEServiceLocal {

    public Usuario obtenerUsuario(){
        
        
        
        Usuario u = Metodos.obtener("1716497323");
//        u.setClave("1231231");
//        u.setCodigoUsuario("123456");
//        u.setFechaNacimiento(new Date());
//        u.setIntentosFallidos(0);
//        List<Telefono> tel = new ArrayList<>();
//        Telefono e = new Telefono();
//        e.setTipo("1");
//        e.setNumero("09875");
//        tel.add(e);
//        u.setTelefonos(tel);
//        e.setTipo("2");
//        e.setNumero("09875");
//        tel.add(e);
//        u.setTelefonos(tel);
//        e.setTipo("3");
//        e.setNumero("09875");
//        tel.add(e);
//        u.setTelefonos(tel);
        return u;
    }
}

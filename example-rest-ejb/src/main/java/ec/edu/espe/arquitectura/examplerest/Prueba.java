
package ec.edu.espe.arquitectura.examplerest;

import java.util.Random;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author guffenix
 */
@Stateless
@LocalBean
public class Prueba {

    public Integer prueba(Boolean accion){
        Random rnd = new Random();
        if ((rnd.nextInt(50)%3) == 0) {
            return 1;
        }else{
            throw new RuntimeException("Ocurrio un error.");
        }
    }

}

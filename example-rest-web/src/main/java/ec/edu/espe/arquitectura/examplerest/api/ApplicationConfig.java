
package ec.edu.espe.arquitectura.examplerest.api;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author guffenix
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ec.edu.espe.arquitectura.examplerest.api.EstudianteResource.class);
        resources.add(ec.edu.espe.arquitectura.examplerest.api.LoginResource.class);
        resources.add(ec.edu.espe.arquitectura.examplerest.api.PersonaResource.class);
        resources.add(ec.edu.espe.arquitectura.examplerest.api.PruebaResource.class);
        resources.add(ec.edu.espe.arquitectura.examplerest.api.PruebasResource.class);
    }
    
}

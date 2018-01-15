package cdi;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author andre
 */

public class LoggingProduces {
    /*the rt.jar file does not have a beans.xml file*/
    @Produces
    public Logger loggerProducer(InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
    
}

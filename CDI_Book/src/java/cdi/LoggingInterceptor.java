package cdi;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
/**
 *
 * @author andre
 */
@Interceptor
@Loggable
public class LoggingInterceptor {
    
    @Inject
    private Logger log;

    public LoggingInterceptor() {
    }
    /*Definito il metodo log in AroundInvoke: l'invocazione di questo metodo avviene all'entrata 
    ed all'uscita delll'interceptor*/
    @AroundInvoke
    public Object logMethod(InvocationContext ivc) throws Exception{
        log.entering(ivc.getTarget().getClass().getName() , ivc.getMethod().getName());
        try{
            /*Segue con il prossimo interceptor*/
            return ivc.proceed();
        }finally{
           log.exiting(ivc.getTarget().getClass().getName(), ivc.getMethod().getName());
        }
    }
}
package cdi;

import java.lang.annotation.Retention;
import javax.interceptor.InterceptorBinding;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Target;
/**
 *
 * @author andre
 */
@InterceptorBinding
@Retention(RUNTIME)
@Target({METHOD ,TYPE })
public @interface Loggable {    
}

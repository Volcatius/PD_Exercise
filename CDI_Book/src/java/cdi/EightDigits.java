package cdi;

/*Import delle annotazioni Quelifier Target e retention*/
import javax.inject.Qualifier;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
/*Import per i parametri delle annatazioni Retention e Target*/
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
/**
 *
 * @author andre
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface EightDigits {
    
}

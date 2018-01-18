package hello;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author andre
 */
@Stateless
@LocalBean
public class HelloBean implements HelloWorldBeanRemote{

    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
    
}

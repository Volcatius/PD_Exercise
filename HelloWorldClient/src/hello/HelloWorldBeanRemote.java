package hello;

import javax.ejb.Remote;


/**
 *
 * @author andre
 */
@Remote
public interface HelloWorldBeanRemote {
    String sayHello (String str); 
}

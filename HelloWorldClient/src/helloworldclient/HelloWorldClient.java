package helloworldclient;

import hello.HelloWorldBeanRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author andre
 */
public class HelloWorldClient {
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx;
        ctx = new InitialContext();
        
        HelloWorldBeanRemote hello = (HelloWorldBeanRemote) ctx.lookup("java:global/HelloWorldEJB/HelloBean!hello.HelloWorldBeanRemote");
        
        System.out.println("Invoco il metodo remoto...");
        
        System.out.println("Chiamto il metodo remoto con Andrea come parametro: " + hello.sayHello("Andrea"));
        
    }
    
}

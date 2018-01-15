package cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author andre
 */
public class Main {
    
    public static void main(String[] args){
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
    
        BookService bookService = container.instance().select(BookService.class).get();
        
        Book book = bookService.createBook("Grinfie", 5.2F, "Gigi non fare il push");
        
        System.out.println(book.toString());
        
        weld.shutdown();
    }
    
}

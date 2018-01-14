package cdi;

import javax.inject.Inject;

/**
 *
 * @author andre
 */
public class BookLegacy {
    
    @Inject @EightDigits
    public NumberGeneretor numberGenerator;
    
    public Book createLegacyBook(String title, float price, String description){
        Book bookleg = new Book(title, price, description);
        bookleg.setIssn(numberGenerator.generatedNumber());
        return bookleg;
        
    }
    
}

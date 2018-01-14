package cdi;

import javax.inject.Inject;

/**
 *
 * @author andre
 */
public class BookService {
    
    @Inject @ThirteenDigits
    public NumberGeneretor numberGeneretor;

    public Book createBook(String title, float prize, String description){
        Book book = new Book(title, prize, description);
        book.setIsbn(numberGeneretor.generatedNumber());
        return book;
    }

}

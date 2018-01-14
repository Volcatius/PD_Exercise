package cdi;

/**
 *
 * @author andre
 */
public class Book {
    
    private String title;
    private float prize;
    private String description;
    private String issn;
    private String isbn;
    
    public Book(String title, float prize, String description) {
        this.title = title;
        this.prize = prize;
        this.description = description;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    
    
}

package jpa_project;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1: Creazione dell'instanza book 
        Book book = new Book("TITOLO", 5F, "Una descrizione che si addice");
        
        // 2: Creazione dell'entity manager e della transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        // 3: Inizio transizione e persistenza sul db 
        et.begin();
        em.persist(book);
        et.commit();
        
        /* Call della namdeQuery e stampa a terminale dei risultati
        Query all = em.createNamedQuery("findAllBook", Book.class);
        
        List<Book> result = all.getResultList();
        
        for (Book b : result){
            System.out.println(b.toString());
        }
        */
        
        // 4: Close 
        em.close();
        emf.close();
        
    }
}

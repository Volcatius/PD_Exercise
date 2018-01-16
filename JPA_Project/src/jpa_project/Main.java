package jpa_project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book book = new Book("TITOLO", 5F, "Una descrizione che si addice");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        em.persist(book);
        et.commit();
        
        em.close();
        emf.close();
        
    }
}

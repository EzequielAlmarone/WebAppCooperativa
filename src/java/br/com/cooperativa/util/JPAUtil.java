package br.com.cooperativa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ezequiel
 */
public class JPAUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}

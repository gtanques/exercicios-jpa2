package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryJPA {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("laranjas");
    public static EntityManager em = emf.createEntityManager();

    public static void salvarObjeto(Object obj){
        // abrir transaction
        em.getTransaction().begin();

        // persistir dados
        em.persist(obj);

        // commitar dados
        em.getTransaction().commit();

        // fechar transaction
        em.close();
    }



}

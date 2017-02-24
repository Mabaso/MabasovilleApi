package rest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by User on 2016-10-21.
 */
public class Main {

    @PersistenceContext
    EntityManager em;
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config/context.xml");
//        NamedParameterJdbcTemplate namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) context.getBean("jdbcTemplate");
//        List<Areas> areas = namedParameterJdbcTemplate.query("select * from ranks", new HashMap<String, Object>(), new AreasMapper());
//        System.out.println(areas);

        EntityManagerFactory emf = (EntityManagerFactory)context.getBean("entityManagerFactory");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        Query nativeQuery = em.createNativeQuery("select * from ranks");
        Query query = em.createQuery("select a from Areas a");
        List resultList = query.getResultList();
        System.out.println(resultList);
        em.getTransaction().commit();
    }
}

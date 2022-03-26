package hibernate;

import hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3PersistExample {
    public static void main(String[] args) {
        // PersistExample
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Dog shreck = new Dog("Shreck", 10, "Hasky");
        System.out.println("Id "+shreck.getId());
        session.persist(shreck);
        System.out.println("Id "+shreck.getId());
        shreck.setName("Lessie");
        shreck.setAge(5);
       // session.evict(shreck);// odciecie i nic sie nei statnie
        shreck.setRace("Collie");

        transaction.commit();
        session.close();
    }
}

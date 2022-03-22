package Hibernate;

import Hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2PersistEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog nestor = new Dog("Nestor", 2, "Other");
        session.persist(nestor); //transient - Hebernate o niej nie wie

        session.persist(new Dog("Nestor", 2, "Other"));
        session.persist(new Dog("Lady", 8, "York"));
        session.persist(new Dog("Reksio", 2, "terrier"));
        session.persist(new Dog("Cywil", 2, "Owczarek niewmiecki"));
        session.persist(new Dog("Hot dog", 2, "Jamnik"));

        transaction.commit();
        session.close();
    }
}

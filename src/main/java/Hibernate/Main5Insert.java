package Hibernate;

import Hibernate.HibernateUtils;
import Hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main5Insert
{
    public static void main(String[] args) {
        SessionFactory newSession = HibernateUtils.getSessionFactory();
        Session session = newSession.openSession();
        Transaction newTransaction = session.beginTransaction();

        Dog nysa = new Dog("Nysa", 12, "Labrador");
        Dog szarik = new Dog("Szarik", 3, "Owczarek Niemiecki" );
        session.persist(nysa);
        System.out.println("Id "+nysa.getId());


        session.persist(szarik);
        System.out.println("Id "+szarik.getId());

        Dog lambo = new Dog("Lambo", 5, "Beagel");
        session.persist(lambo);
        System.out.println("Id "+lambo.getId());
        lambo.setRace("Beagle");
        System.out.println("Id "+lambo.getId());

        newTransaction.commit();
        session.close();
    }
}

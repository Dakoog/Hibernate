package Hibernate;

import Hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main7DeleteEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
    ;
        Transaction transaction = session.beginTransaction();
        Dog dogOne = session.find(Dog.class, 17l);// usuwanie danych
        if(dogOne != null){
            session.delete(dogOne);
        }
        transaction.commit();
        session.close();


    }
}

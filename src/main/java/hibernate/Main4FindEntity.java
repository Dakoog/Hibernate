package hibernate;


import hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main4FindEntity {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dogOne = session.find(Dog.class, 2L);  // SELECT
        if (dogOne != null) {
            System.out.println(dogOne.getId());
            System.out.println(dogOne.getName());
        }

        Dog dogTwo = session.get(Dog.class, 5L); // SELECT
        if (dogTwo != null) {
            System.out.println(dogTwo.getId());
            System.out.println(dogTwo.getName());
        }

        Dog dogThree = session.load(Dog.class, 19L);
        if (dogThree != null) {
            System.out.println(dogThree.getId());
            System.out.println(dogThree.getName()); // SELECT -> ObjectNotFoundException
        }

        transaction.commit();
        session.close();
    }
}
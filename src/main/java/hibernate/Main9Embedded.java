package hibernate;

import hibernate.entity.Address;
import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main9Embedded {
    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Address address = new Address("Otwock","Andriollego");

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("11/05/1997");
        Employee employee = new Employee("Ola", "strongPassword", "567656108",
                21, date, Employee.Gender.FEMALE, "descriptoin");
        employee.setAddress(address);

        address.setStreet("Chopina");
        session.persist(employee);

        transaction.commit();
        session.close();

        // nowy obiekt wboudowany

    }
}

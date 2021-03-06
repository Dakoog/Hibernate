package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
    // jest to narzędzie hibernate
    // stworzony jest singleton
    private static SessionFactory sessionFactory;
    static{
        StandardServiceRegistry registry=  new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")// załadowanie konfiguracji hibernate
                .build();
     // jest odpowiedzialna za utworzenie rejestru i skonfigurowanie w nim parametrów
        // potrzebnych do utworzenia sesji

 sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
 // utworzenie produkcji sesji tworzących transakcje w bazach danych
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

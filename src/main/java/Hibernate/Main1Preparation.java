package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main1Preparation {
    //        MetadataSources metadataSources = new MetadataSources(registry);
    //        Metadata metadata = metadataSources.buildMetadata();
     //        SessionFactory sessionFactory = metadata.buildSessionFactory();
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    }
}

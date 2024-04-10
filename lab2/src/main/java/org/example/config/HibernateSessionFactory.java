package org.example.config;

import org.example.models.Discipline;
import org.example.models.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactory {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Discipline.class);
                configuration.addAnnotatedClass(Teacher.class);

                StandardServiceRegistryBuilder builder =
                        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Exception: " + e);
            }
        }
        return sessionFactory;
    }


}
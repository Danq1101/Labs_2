package org.example.repository.impl;

import org.example.config.HibernateSessionFactory;
import org.example.repository.DisciplineRepository;
import org.hibernate.Session;

public class DisciplineRepositoryImpl implements DisciplineRepository {
    @Override
    public String findDateByNumberOfPairs(int numberOfPairs) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        String date = session.createQuery
                ("select d.date from Discipline d " +
                        "where Teacher.numberOfPairs = :numberOfPairs").toString();

        session.close();
        return date;
    }

    @Override
    public String findDateByNumberOfClass(int numberOfClass) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        String date = session.createQuery
                ("select d.date from Discipline d" +
                        "where d.nubmerOfPairs =: numberOfPairs").toString();
        return null;
    }
}

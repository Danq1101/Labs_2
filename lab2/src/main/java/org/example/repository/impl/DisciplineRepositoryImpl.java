package org.example.repository.impl;

import org.example.config.HibernateSessionFactory;
import org.example.models.Discipline;
import org.example.repository.DisciplineRepository;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DisciplineRepositoryImpl implements DisciplineRepository  {
    @Override
    public List<Discipline> findDateByNumberOfPairs(int numberOfPairs) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Discipline> discipline = session.createQuery
                ("select d from Discipline d " +
                        "join d.teacher t " +
                        "where t.numberOfPairs =: numberOfPairs", Discipline.class)
                .setParameter("numberOfPairs", numberOfPairs)
                .getResultList();
        session.close();
        return discipline;
    }

    @Override
    public List<Discipline> findDateByNumberOfClass(int numberOfClass) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Discipline> discipline = session.createQuery("select d from Discipline d " +
                        "where d.numberOfClass =: numberOfClass", Discipline.class)
                .setParameter("numberOfClass", numberOfClass)
                .getResultList();
        session.close();
        return discipline;
    }
}

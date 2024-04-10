package org.example.repository.impl;

import org.example.config.HibernateSessionFactory;
import org.example.models.Teacher;
import org.example.repository.TeacherRepository;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {


    @Override
    public List<Teacher> findTeachersByDateByClass(String date, Integer numberOfClass) {
        Session session= HibernateSessionFactory.getSessionFactory().openSession();
        List<Teacher> teachers =  session.createQuery("SELECT t FROM Teacher t " +
                        "join t.disciplines d " +
                        "where d.date=: date and d.numberOfClass=: numberOfClass", Teacher.class)
                .setParameter("numberOfClass", numberOfClass)
                .setParameter("date", date)
                .getResultList();
        session.close();
        return teachers;
    }

    @Override
    public List<Teacher> findTeacherNotWorking(String date) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Teacher> teachers = session.createQuery("select t from Teacher t " +
                "join t.disciplines d " +
                "where d.date !=: date", Teacher.class)
                .setParameter("date", date)
                .getResultList();
        session.close();
        return teachers;
    }
}

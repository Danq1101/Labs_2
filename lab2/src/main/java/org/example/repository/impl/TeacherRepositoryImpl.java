package org.example.repository.impl;

import org.example.config.HibernateSessionFactory;
import org.example.models.Teacher;
import org.example.repository.TeacherRpository;
import org.hibernate.Session;

import java.util.List;

public class TeacherRepositoryImpl implements TeacherRpository {


    @Override
    public List<Teacher> findTeachersByDateByClass(String date, int numberOfClass) {
        Session session= HibernateSessionFactory.getSessionFactory().openSession();
        List<Teacher> teachers = session.createQuery
                ("select t from Teacher t" +
                        "JOIN t.disciplines d" +
                        " where Discipline.date = :date and Discipline.numberOfClass = :numberOfClass").getResultList();

        session.close();
        return teachers;
    }

    @Override
    public List<Teacher> findTeacherNotWorking(String date) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Teacher> teachers = session.createQuery
                ("select t from Teacher t" +
                        " where Discipline.date = '30.02' and Teacher.numberOfPairs = 0").getResultList();

        session.close();
        return teachers;
    }
}

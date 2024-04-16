package org.example.repository.impl;

import org.example.config.HibernateSessionFactory;
import org.example.model.Student;
import org.example.repository.StudentsRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentsRepository {

    @Override
    public List<Student> readAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).getResultList();
        session.close();
        return students;
    }

    @Override
    public void deleteStudent(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.createQuery("delete from Student s where s.id =: id")
                .setParameter("id", id).executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void updateStudent(int id, String department) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.createMutationQuery("UPDATE Student s SET s.department =: department " +
                "where s.id =: id")
                .setParameter("id", id)
                .setParameter("department", department)
                .executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void createStudent(Student student) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}

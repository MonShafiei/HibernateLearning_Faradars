package com.mohsen.main;

import com.mohsen.entitiy.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by Mohsen on 18/10/06.
 */
public class SimpleInsert {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("com/mohsen/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(new Person("ali", "shafiei"));
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

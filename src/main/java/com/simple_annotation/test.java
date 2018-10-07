package com.simple_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by Mohsen on 18/10/07.
 */
public class test {

    public static void main(String[] args) {

        Member m = new Member();
        //m.setId(1);
        m.setName("mohsen");
        m.setFamily("Shafiei");
        Address addr1 = new Address();
        addr1.setCity("Tehran");
        addr1.setStreet("ValiAsr");
        addr1.setZipCode("1111");
        m.getAddresss().add(addr1);

        Address addr2 = new Address();
        addr2.setCity("Shiraz");
        addr2.setStreet("Ghasrodasht");
        addr2.setZipCode("1111");
        m.getAddresss().add(addr2);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(m);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

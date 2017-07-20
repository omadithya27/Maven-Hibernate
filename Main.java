package com.jeng.pgtest.app;

import com.jeng.pgtest.model.Host;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Host host = new Host("klrx001", "RedHat");
        session.save(host);

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}

package com.example.esdprojectnew.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    public static final SessionFactory sessionFact;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            sessionFact = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Issue in creating Initial Session Factory"+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFact.openSession();
    }
}

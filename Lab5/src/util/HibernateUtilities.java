package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtilities {

    private SessionFactory sessionFactory = null;

    public HibernateUtilities() {
    }

    private SessionFactory createSessionFactory() {
        synchronized (HibernateUtilities.class) {
            try {
                sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
                return sessionFactory;
            } catch (HibernateException ex) {
                // Log the exception. 
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
    }

    public SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            sessionFactory = createSessionFactory();
        }
        return sessionFactory;
    }

    public Session openSession() {
        return getSessionFactory().openSession();
    }

    public void close() {
        getSessionFactory().close();
    }
}

package util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new AnnotationConfiguration()
                    .configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    } 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session openSession() {
        return sessionFactory.openSession();
    }
    public static void close() {
        sessionFactory.close();
    }
}


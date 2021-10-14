package dal;

import domain.Sinhvien;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Sinhvien_DAL {

    public static ArrayList<Sinhvien> getAll() {

        Session session = null;
        Transaction tx = null;
        ArrayList<Sinhvien> dsSv = null;
        try {
            session = HibernateUtil.openSession();
            tx = session.beginTransaction();
            dsSv = (ArrayList<Sinhvien>) session.createQuery("FROM Sinhvien").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("LỖI: " + ex);
        } finally {
            session.close();
            System.out.println("ĐÃ ĐÓNG SESSION.");
        }
        return dsSv;
    }

    public static Integer insert(Sinhvien sv) {
        Session session = null;
        Transaction tx = null;
        Integer newID = null;
        try {
            session = HibernateUtil.openSession();
            tx = session.beginTransaction();
            newID = (Integer) session.save(sv);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("LỖI: " + ex);
        } finally {
            session.close();
            System.out.println("ĐÃ ĐÓNG SESSION.");
        }
        return newID;
    }

    public static Boolean delete(Sinhvien sv) {
        Session session = null;
        Transaction tx = null;
        Boolean result = Boolean.FALSE;
        try {
            session = HibernateUtil.openSession();
            tx = session.beginTransaction();
            session.delete(sv);
            tx.commit();
            result = Boolean.TRUE;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("LỖI: " + ex);
        } finally {
            session.close();
            System.out.println("ĐÃ ĐÓNG SESSION.");
        }
        return result;
    }

    public static Boolean update(Sinhvien sv) {
        Session session = null;
        Transaction tx = null;
        Boolean result = Boolean.FALSE;
        try {
            session = HibernateUtil.openSession();
            tx = session.beginTransaction();
            session.update(sv);
            tx.commit();
            result = Boolean.TRUE;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("LỖI: " + ex);
        } finally {
            session.close();
            System.out.println("ĐÃ ĐÓNG SESSION.");
        }
        return result;
    }
}

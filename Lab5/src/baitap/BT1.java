package baitap;

import domain.Sinhvien;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

public class BT1 {

    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        ses.beginTransaction();
        List<Sinhvien> danhsachsv = ses.createQuery("from Sinhvien").list();
        danhsachsv.forEach(System.out::println);
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}

import domain.Lop;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

public class Lab5_1 {
    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        ses.beginTransaction();
        List<Lop> dslop = ses.createQuery("from Lop").list();
        dslop.forEach((lop) -> {
            System.out.println(lop);
        });
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}




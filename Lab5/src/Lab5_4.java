import domain.Lop;
import domain.Sinhvien;
import org.hibernate.Session;
import util.HibernateUtil;
public class Lab5_4 {
    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, 1);
        if (lop!=null) {
            Sinhvien sv = new Sinhvien();
            sv.setHoten("Cao Chien Hao");
            sv.setDtb(9.5);
            sv.setLop(lop);
            ses.save(sv);
            System.out.println("Them thanh cong!");
            System.out.println(sv);
        } else
            System.out.println("Khong tim thay lop!"); 
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}


import domain.Lop;
import org.hibernate.Session;
import util.HibernateUtil;
import java.util.*;
public class Lab5_2 {
    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma lop: ");
        int malop = input.nextInt();
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, malop);
        if (lop!=null) {
            System.out.println(lop);
            lop.getSinhviens().forEach((sv) -> {
                System.out.println(sv);
            });
            
        } else
            System.out.println("Khong tim thay!");
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}



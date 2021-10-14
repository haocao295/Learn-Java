import domain.Lop;
import java.util.Scanner;
import org.hibernate.Session;
import util.HibernateUtil;
public class Lab5_3 {
    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        Scanner input = new Scanner(System.in);
        System.out.println("Cap nhat ten lop.");
        System.out.print("Nhap ma lop: ");
        int malop = input.nextInt();
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, malop);
        if (lop!=null) {
            System.out.print("Nhap ten lop: ");
            input.nextLine();
            String tenlop = input.nextLine();
            lop.setTenlop(tenlop);
            ses.saveOrUpdate(lop);
            System.out.println("Cap nhat thanh cong!");
        } else
            System.out.println("Khong tim thay!"); 
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}



package baitap;

import domain.Lop;
import java.util.Scanner;
import org.hibernate.Session;
import util.HibernateUtil;

public class BT3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Them lop");
        System.out.print("Nhap ma lop: ");
        int malop = input.nextInt();
        themlop(malop);
    }

    public static void themlop(int malop) {
        Session ses = HibernateUtil.openSession();
        Scanner input = new Scanner(System.in);
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, malop);
        if (lop != null) {
            System.out.println("Da ton tai ma lop");
        } else {

            System.out.print("Nhap ten lop: ");
            input.nextLine();
            String tenlop = input.nextLine();
            lop = new Lop(malop, tenlop, null);
            ses.save(lop);
        }
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}

package baitap;

import domain.Lop;
import java.util.Scanner;
import org.hibernate.Session;
import util.HibernateUtil;

public class BT3_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Xoa lop");
        System.out.print("Nhap ma lop: ");
        int malop = input.nextInt();
        xoalop(malop);
    }

    public static void xoalop(int malop) {
        Session ses = HibernateUtil.openSession();
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, malop);
        if (lop != null) {
            ses.delete(lop);
            System.out.println("Da xoa thanh cong lop co ma lop = " + malop);
        } else {
            System.out.print("Loi: ma lop = " + malop + " khong ton tai!");
        }
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}

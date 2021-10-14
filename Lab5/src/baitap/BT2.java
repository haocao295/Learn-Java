package baitap;

import domain.Sinhvien;
import java.util.Scanner;
import org.hibernate.Session;
import util.HibernateUtil;

public class BT2 {

    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        int masv = input.nextInt();
        ses.beginTransaction();
        Sinhvien sv = (Sinhvien) ses.get(Sinhvien.class, masv);
        if (sv != null) {
            System.out.println(sv);
        } else {
            System.out.println("Khong tim thay!");
        }
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}

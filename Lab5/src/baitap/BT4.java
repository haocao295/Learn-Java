package baitap;

import domain.Lop;
import domain.Sinhvien;
import java.util.Scanner;
import org.hibernate.Session;
import util.HibernateUtil;

public class BT4 {

    public static void main(String[] args) {
        Session ses = HibernateUtil.openSession();
        Scanner input = new Scanner(System.in);

        System.out.println("Them sinh vien");
        System.out.print("Nhap ma lop: ");
        int malop = input.nextInt();
        ses.beginTransaction();
        Lop lop = (Lop) ses.get(Lop.class, malop);
        if (lop != null) {
            System.out.print("Nhap ten sinh vien: ");
            input.nextLine();
            String tensv = input.nextLine();
            System.out.print("Nhap diem trung binh: ");
            double dtb = input.nextDouble();
            Sinhvien sv;
            sv = new Sinhvien(lop, tensv, dtb);
            ses.save(sv);
        } else {
            System.out.print("Loi: ma lop = " + malop + " khong ton tai!");
        }
        ses.getTransaction().commit();
        HibernateUtil.close();
    }
}

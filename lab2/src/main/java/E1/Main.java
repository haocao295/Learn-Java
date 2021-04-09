package E1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String hoTen;
        int ngayCong;
        double luongCB;
        do {
            scanner.reset();
            System.out.print("nhap ho ten (exit de thoat): ");
            hoTen = scanner.nextLine();
            if (hoTen.equals("exit")) {
                break;
            }
            System.out.print("nhap so ngay gia cong: ");
            ngayCong = Integer.parseInt(scanner.nextLine());
            System.out.print("nhap luong co ban: ");
            luongCB = Double.parseDouble(scanner.nextLine());
            NhanVien nhanVien = new NhanVien(hoTen, ngayCong, luongCB);
            danhSachNhanVien.add(nhanVien);
        } while (true);

        danhSachNhanVien.forEach(nv -> System.out.println(nv.toString() + "\n==========================="));

        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.getLuong();
        }
        System.out.println("luong all nhan vien: " + tongLuong);
    }
}

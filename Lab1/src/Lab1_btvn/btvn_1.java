package Lab1_btvn;

import java.util.Scanner;

public class btvn_1 {
    public static void main(String[] args)
    {
        int soluong, sogio;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong:");
        soluong = scanner.nextInt();
        System.out.print("Nhập gio lam viec: ");
        sogio = scanner.nextInt();
        if(sogio<40){
            int tongluong=0;
            tongluong=soluong*sogio;
            System.out.println("tong luong cua nhan vien la: "+tongluong);  
        }
        else if(sogio>=40){
            int tongluong1=0;
            tongluong1=(40*soluong*15/10)+(sogio-40);
            System.out.println("tong luong cua nhan vien la: "+tongluong1);
        }
          System.out.println("khong co luong");
    }
}

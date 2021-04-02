package lab1;

import java.util.Scanner;

public class lab1_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b,c;
        System.out.print("Nhập điểm toán: ");
        a = input.nextDouble();
        System.out.print("Nhập điểm văn: ");
        b = input.nextDouble();
        System.out.print("Nhập điểm anh: ");
        c = input.nextDouble();

        double dtb = (a+b+c)/3;

        if(dtb<5)
            System.out.print("Rớt");
        else if(dtb>=5)
            System.out.println("Đậu");
         if(dtb >=5 && dtb <7)
            System.out.println("Trung Bình");
         if(dtb >=7 && dtb <8)
            System.out.println("Khá");
        if(dtb>=8 && dtb <9)
            System.out.println("Giỏi");
        if(dtb >=9)
            System.out.println("Xuất Sắc");


    }


}

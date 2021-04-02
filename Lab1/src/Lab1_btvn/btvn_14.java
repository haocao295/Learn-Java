package Lab1_btvn;

import java.util.Scanner;

public class btvn_14 {
     public static void main(String[] args)
    {
        String chuoi;
        Scanner input = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        chuoi = input.nextLine();
	String[] arr = chuoi.split(" ");
	String chuoi1 = "";
	for (String x : arr) {
		chuoi1 += (x.substring(0, 1).toUpperCase() + x.substring(1));
		chuoi1 += " ";
	}
	System.out.println("Biến các chữ đầu thành hoa: " + chuoi1);
    }
}

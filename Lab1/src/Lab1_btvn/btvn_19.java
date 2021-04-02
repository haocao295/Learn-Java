package Lab1_btvn;

import java.util.Date;
import java.util.Scanner;

public class btvn_19 {
    public static void main(String[] args)
    {  
        int ngay, thang, nam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.print("nhap thang: ");
        thang = scanner.nextInt();
        System.out.print("nhap nam: ");
        nam = scanner.nextInt();
        Date date = new Date();
        int y = date.getYear()+1900;
        System.out.println("tuoi cua ban la: "+ (y-nam));
        
    }

}
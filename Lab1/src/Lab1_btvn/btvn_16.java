package Lab1_btvn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class btvn_16 {
    public static void main(String[] args)
    {  
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Ngay hien tai: "+ sdf.format(date));
        int x = date.getMonth()+1;
        int y = date.getYear()+1900;
        switch (x){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Ngay cuoi thang: 31/"+x+"/"+y);
                break;
            case 4:
            case 6:
            case 9: 
            case 11:
                System.out.println("Ngay cuoi thang: 30/"+x+"/"+y);
                break;
            case 2:
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                    System.out.println("Ngay cuoi thang: 29/"+x+"/"+y);
                } else {
                    System.out.println("Ngay cuoi thang: 28/"+x+"/"+y);
                }
            default:
                System.out.println("loi!");
        }
    }

}
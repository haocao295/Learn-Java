package Lab1_btvn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class btvn_13 {
    public static void main(String[] args)
    {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date;
        date = new Date();
        System.out.println("Ngay hien tai: "+ sdf.format(date));
        System.out.println("Gio hien tai: "+ java.time.LocalTime.now());
        
    }
}

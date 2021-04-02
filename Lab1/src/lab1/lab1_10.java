package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class lab1_10 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date;
        date = new Date();
        System.out.println("Ngay hien tai: "+ sdf.format(date));

    }

}

package Lab1_btvn;

import java.util.Calendar;
import java.util.TimeZone;

public class btvn_15 {
    public static void main(String[] args)
    {
        Calendar time = Calendar.getInstance();
        time.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Gio New York: "+time.get(Calendar.HOUR_OF_DAY)+":"+time.get(Calendar.MINUTE)+":"+time.get(Calendar.SECOND));
    }
}

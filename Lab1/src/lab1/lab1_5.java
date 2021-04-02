/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class lab1_5 {
    public static void main(String[] args) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date;
        date = new Date();
        System.out.println("Ngay hien tai: "+ sdf.format(date));
       
        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
 
        String d = simpleDateFormat.format(new Date());
            System.out.println(d);
        
    }
    
    
}

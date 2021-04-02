/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Administrator
 */
public class lab1_4 {
    
    public static void main(String[] args) {
        String s = "  dai hoc cong nghe sai gon  ";
        System.out.println("Chieu dai: "+s.length());
        s = s.trim();
        System.out.println("Bo khoang trang truoc va sau chuoi:  " + s + " ");
        s= s.replaceAll(" "," ");
        System.out.println("Bo khoang trang du thua  " + s + " ");
        
       String[] a = s.split(" ");
	
	String s1 = "";
	for (String x : a) {
		s1 = s1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
		s1 = s1 + " ";
	}
	System.out.println("Biến các chữ đầu thành hoa: " + s1);
    }
    
    
}

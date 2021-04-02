/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class lab1_8 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a[]; int b ;
        System.out.print("Nhap so ptu: ");
        b = input.nextInt();
        a = new float[b];
         for (int i = 0; i < a.length; i++) {
             System.out.print("a["+i+"]: ");
            a[i] = input.nextFloat();
             
         }
       System.out.print("\nMang vua nhap: ");
        XuatMang(a);
         System.out.print("\nPtu lon nhat: " + timMax(a));
        
     }
    
          public static void XuatMang(float a[]){
     for (int i = 0; i < a.length; i++) {
         System.out.print("\t" +a[i]);
        }
   }
          public static float timMax(float a[]){
              float max=0;
              for (int i = 0; i < a.length; i++) {
                  if(a[i]>max)
                      max=a[i];
              }
              
              
              
              return max;
          }
}

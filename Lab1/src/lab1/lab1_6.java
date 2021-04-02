/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import static lab1.lab1_3.XuatMang;

/**
 *
 * @author Administrator
 */
public class lab1_6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[],b = 3;
        System.out.print("Nhap 3 ptu: ");
        
        a = new int[b];
         for (int i = 0; i < a.length; i++) {
             System.out.print("a["+i+"]: ");
            a[i] = input.nextInt();
             
         }
       System.out.print("\nMang vua nhap: ");
        XuatMang(a);
         System.out.print("\nPtu lon nhat: " + timMax(a));
        
     }
    
          public static void XuatMang(int a[]){
     for (int i = 0; i < a.length; i++) {
         System.out.print("\t" +a[i]);
        }
   }
          public static int timMax(int a[]){
              int max=0;
              for (int i = 0; i < a.length; i++) {
                  if(a[i]>max)
                      max=a[i];
              }
              
              
              
              return max;
          }
}

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
public class lab1_3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[],b;
        System.out.print("Nhap so ptu: ");
        b = input.nextInt();
        a = new int[b];
         for (int i = 0; i < a.length; i++) {
             System.out.print("a["+i+"]: ");
            a[i] = input.nextInt();
             
         }
       System.out.print("\nMang vua nhap: ");
        XuatMang(a);
       System.out.print( "\nTong cac ptu la:  " +tong(a));
        System.out.print( "\nTong cac ptu le la:  " +tongLe(a));
       
       
       
       
      
               
          
           
           
      
    }
   public static void XuatMang(int a[]){
     for (int i = 0; i < a.length; i++) {
         System.out.print("\t" +a[i]);
        }
   }
   
   public static int tong(int a[]){
       int s=0;
       for (int i = 0; i < a.length; i++) {
           s+=a[i];
           
       }
       return s;
   }

   public static int tongLe(int a[]){
       int s=0;
       for (int i = 0; i < a.length; i++) {
           if(a[i]%2!=0){
              s+=a[i];
           }
       }
       return s;
   }
}

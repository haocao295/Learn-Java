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
public class lab1_7 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
   
            
      //  System.out.print("Nhap thang: ");
      //  a = input.nextInt();
     
        do{
           // System.out.print("Sai! nhap lai  ");
             System.out.print("Nhap thang: ");
            a = input.nextInt();
        }while(a<1 && a>12);
            
        if(a==1 || a==2 || a==3){
            System.out.print("Quy 1 ");
        }
        else if(a==4 || a==5 || a==6){
            System.out.print("Quy 2 ");
        }
        else if(a==7 || a==8 || a==9){
            System.out.print("Quy 3 ");
        }
        else if(a==10 || a==11 || a==12){
            System.out.print("Quy 4 ");
        }
        }

    
    
}
    
    


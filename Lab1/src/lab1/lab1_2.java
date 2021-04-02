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
public class lab1_2 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x,y, kq=0;
        String c;
        System.out.print("Nhap so x: ");
        x = input.nextFloat();
        System.out.print("Nhap so y: ");
        y = input.nextFloat();
        input.nextLine();
        System.out.print("Phep Toan: ");
        c = input.nextLine();
        switch (c){
            case "+":
                kq = x+y;
                break;
                
            case "-":
                kq= x-y;
                break;
            case "*":
                kq = x*y;
                break;
            case "/":
                if(y==0){
                     System.out.print("So Chia Sai!");
                     break;
                } else 
                        kq = x/y;
                        break;
                
            default :
                System.out.print("Phep Toan Sai!");
                break;
                
        }
        System.out.println(x+ " "+ c +" "+ y +" = " +kq);

    }
}

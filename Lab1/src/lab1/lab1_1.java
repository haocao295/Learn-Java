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
public class lab1_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Nhap so a: ");
        a = input.nextInt();
        System.out.print("Nhap so b: ");
        b = input.nextInt();
        if(a==b){
            System.out.println(a+ "="+b);
        }
        else if(a>b){
            System.out.println(a+ ">"+b);
        }
        else if(a<b){
             System.out.println(a+ "<"+b);
        }
       
    }
}

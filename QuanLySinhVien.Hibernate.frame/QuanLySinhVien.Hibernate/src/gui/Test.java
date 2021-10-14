/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dal.Sinhvien_DAL;
import domain.Sinhvien;
import java.util.ArrayList;
import util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        
        
        Sinhvien sv1 = new Sinhvien("HOI HOI HOI", "LOP LA", true, 9.9);
        Sinhvien_DAL.insert(sv1);
        
        System.out.println("DANH SACH SINH VIEN:");
        ArrayList<Sinhvien> dsSv = Sinhvien_DAL.getAll();
        for (Sinhvien sv : dsSv) System.out.println(sv);
        
        
        Sinhvien sv2 = dsSv.get(2);
        sv2.setTen("GA GA");
        Sinhvien_DAL.update(sv2);
        
        HibernateUtil.close();
    }
}

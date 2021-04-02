package Lab1_btvn;

import java.util.ArrayList;

public class btvn_11 {
    public static void main(String[] args)
    { 
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Html");
        list.add("Kotlin");
        System.out.println("list : "+list);
        
        ArrayList list1 = new ArrayList();
        list1.add("Java1");
        list1.add("C++1");
        list1.add("PHP1");
        list1.add("Html1");
        list1.add("Kotlin1");
        System.out.println("list 1 : "+list1);
        
        ArrayList list2 = new ArrayList();
        list2.add(list);
        list2.add(list1);
        System.out.println("list noi : "+ list2);
    }
}

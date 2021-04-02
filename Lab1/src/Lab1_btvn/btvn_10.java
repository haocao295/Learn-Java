package Lab1_btvn;

import java.util.ArrayList;
import java.util.Collections;

public class btvn_10 {
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
        
        Collections.swap(list,1,2);
        Collections.swap(list1,1,2);
        System.out.println("list swap : "+list );
        System.out.println("list 1 swap : "+list1 );
    }
}

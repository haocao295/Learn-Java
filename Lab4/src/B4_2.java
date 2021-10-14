import java.util.*;

public class B4_2 {
    public static void main(String[] args) {
       // TODO code application logic here
        ResourceBundle bundle = ResourceBundle.getBundle("prop1");
        bundle.keySet();
        for(String key:bundle.keySet())
            System.out.println("key = " + key + ", value = " + bundle.getString(key));      
    }
}

package Lab1_btvn;

import java.util.Scanner;

public class btvn_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String st;
        System.out.print("nhap noi dung: ");
        st=input.nextLine();
        int result;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='+'){
                result=Integer.parseInt(st.substring(0, i))+Integer.parseInt(st.substring(i+1, st.length()));
                System.out.print(st+" = "+result);
            }
        }
    }
}

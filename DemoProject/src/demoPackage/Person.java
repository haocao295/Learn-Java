package demoPackage;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public int gender;
    public float height;
    public float workDay;

    public Person (String name,int age, int gender, float height, float workDay )
    {
        this.name = name;
        this.age = age;
        this.gender =  gender;
        this.height = height;
        this.workDay = workDay;
    }
    Scanner sc = new Scanner(System.in);
   public void inPut()
   {

       System.out.println("Text your name: ");
       this.name = sc.nextLine();
       System.out.println("Text your age:");
       this.age = sc.nextInt();
       System.out.println("Text your gender:");
       this.gender = sc.nextInt();
       do {
           System.out.println("Incorrect! plz Text again: ");
           this.gender = sc.nextInt();
       }while( this.gender < 3 && this.gender >= 0);
       System.out.println("Text your height:");
       this.height = sc.nextFloat();
       System.out.println(" Text your workDay: ");
       this.workDay = sc.nextFloat();

   }
   public void outPut()
   {
       System.out.println("Your name: "+this.name);
       System.out.println("Your age: "+this.age);
       System.out.print("Your gender: ");
       if(this.gender == 0)
           System.out.print("Female ");
       else if(this.gender == 1)
           System.out.print("Male");
       else if(this.gender == 2)
           System.out.print("Null");
       System.out.println("Your height: "+this.height);
       System.out.println("Your workDay: "+this.workDay);
   }
}

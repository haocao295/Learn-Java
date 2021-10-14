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
    //input
   public void input()
   {

       System.out.println("Text your name: ");
       this.name = sc.nextLine();
       System.out.println("Text your age:");
       this.age = sc.nextInt();
       System.out.println("Text your gender(1 or 0):");
       this.gender = sc.nextInt();
       System.out.println("Text your height:");
       this.height = sc.nextFloat();
       System.out.println(" Text your workDay: ");
       this.workDay = sc.nextFloat();

   }
   //output
   public void output()
   {
       System.out.println("Your name: "+this.name);
       System.out.println("Your age: "+this.age);
       System.out.print("Your gender: ");
       if(this.gender == 0)
           System.out.println("Female ");
       else if(this.gender == 1)
           System.out.println("Male");
       else if(this.gender > 1)
           System.out.println("Null");
       System.out.println("Your height: "+this.height);
       System.out.println("Your workDay: "+this.workDay);
   }
}

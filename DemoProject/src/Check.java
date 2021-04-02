import  java.util.Scanner;

public class Check {

    public static void main(String[] args) {
        Check ck = new Check();
        ck.inPut();
        ck.outPut();
        ck.quality();
        if(ck.checkPass())
            System.out.println("You passed!");
        else System.out.println(" Good luck later!");
        System.out.println("Your salary: "+ ck.netSalary());
    }


    public String name;
    public int age;
    public int gender;
    public float height;
    public double number;
    public float workDay;
    public int coefficients;
    public int date;




    Scanner sc = new Scanner(System.in);

    public void inPut()
    {
        System.out.println("Text your name: ");
        name = sc.nextLine();
        System.out.println("Text your age: ");
        age = sc.nextInt();
        System.out.println("Select your gender: ");
        gender = sc.nextInt();
        System.out.println("Text your height: ");
        height = sc.nextFloat();
        System.out.println("Text your number: ");
        number = sc.nextDouble();
        System.out.println("Text your workdays: ");
        workDay = sc.nextFloat();
        System.out.println("Text your coefficients: ");
        coefficients = sc.nextInt();
        System.out.println("Text your date: ");
        date = sc.nextInt();


    }
    public void outPut()
    {
        System.out.println("Your name: "+name);
        System.out.println("Your age: "+age);
        System.out.println("Your gender: "+gender);
        System.out.println("Your height: "+height);
        System.out.println("Your number: "+number);
        System.out.println("Your workdays: "+workDay);
        System.out.println("Your workdays: "+coefficients);
        System.out.println("Your workdays: "+date);
    }
    public int calculateSalary()
    {
        return (int) (workDay*coefficients);
    }
    public boolean checkSNT()
    {
        int count =0;
        for (int i = 2; i <31/2 ; i++) {
            if(date%i==0)
                count++;
        }
        if(count == 0)
            return true;
        else return false;

    }
    public int netSalary()
    {
        if(checkSNT())
            return calculateSalary()+1000000;
        else return calculateSalary()+500000;
    }
    public boolean checkPass()
    {
        if(age >= 18 && height >=1.7)
            return true;
        else if(age>=18 && height <1.7 )
            return false;
        return false;
    }
    public void quality()
    {
        System.out.print("Your KPI: ");
        if(number >=8.0 && number <=10.0 )
            System.out.println(" Very good!");
        else if(number <8.0 && number >=6.5)
            System.out.println("Good!");
        else if(number <6.5 && number >4.5) {
            System.out.println("OK!");
        } else System.out.println("Fail!");

    }
}

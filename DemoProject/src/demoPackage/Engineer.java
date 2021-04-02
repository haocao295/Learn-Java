package demoPackage;



public class Engineer extends Person{

    private int coefficients;



   public Engineer(String name,int age, int gender, float height, float workDay )
   {
       super(name, age, gender, height, workDay);
       this.coefficients = coefficients;
   }

    @Override
    public void inPut() {
        System.out.println("ENGINEER:");
        super.inPut();
        System.out.println("Text your coefficients: ");
        this.coefficients = sc.nextInt();
    }

    public int NetSalary()
    {
        return (int) (this.workDay * this.coefficients + 2500000);
    }
    @Override
    public void outPut() {
        System.out.println("ENGINEER:");
        super.outPut();
        System.out.println("Your NetSalary: "+ NetSalary());
    }
}

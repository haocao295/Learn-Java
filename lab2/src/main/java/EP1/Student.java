package EP1;

public class Student {

    private String fristName;
    private String lastName;
    private double exam1;
    private double exam2;
    private double exam3;

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getExam1() {
        return exam1;
    }

    public void setExam1(double exam1) {
        this.exam1 = exam1;
    }

    public double getExam2() {
        return exam2;
    }

    public void setExam2(double exam2) {
        this.exam2 = exam2;
    }

    public double getExam3() {
        return exam3;
    }

    public void setExam3(double exam3) {
        this.exam3 = exam3;
    }

    public Student() {
    }

    public Student(String fristName, String lastName, double exam1, double exam2, double exam3) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    @Override
    public String toString() {
        return "Student{" + "fristName=" + fristName + ", lastName=" + lastName + ", exam1=" + exam1 + ", exam2=" + exam2 + ", exam3=" + exam3 + '}';
    }

    public double getAverage() {
        return (this.exam1 + this.exam2 + this.exam3) / 3;
    }

}

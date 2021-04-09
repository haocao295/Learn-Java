package EP1;

public class Main {

    public static void main(String[] args) {
        Student std = new Student("Kha", "Ho", 83, 90, 95);

        System.out.println("Chao ban " + std.getFristName() + " "
                + std.getLastName() + ", Diem trung binh cua ban la :"
                + std.getAverage());

        std.setExam1(93);
        std.setExam2(91);
        std.setExam3(86);

        System.out.println("Chao ban " + std.getFristName() + " "
                + std.getLastName() + ", Diem trung binh ssao khi cap nhat cua ban la :"
                + std.getAverage());

    }

}

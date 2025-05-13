package be.vdab.jpf8;

public class StudentMain {
    public static void main(String[] args) {

        var student1 = new Student("Jente");
        var student2 = new Student("Maria", 69);

        System.out.println("Student 1: " + student1.getNaam() + ", score: " + student1.getScore());
        System.out.println("Student 2: " + student2.getNaam() + ", score: " + student2.getScore());

        student1.setScore(51);

        System.out.println("Student 1: " + student1.getNaam() + ", score: " + student1.getScore());
        System.out.println("Student 2: " + student2.getNaam() + ", score: " + student2.getScore());
    }
}

package az.edu.turing.module2.OopLessons;

public class PersonApp {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Tom", 20, 75.5);

        Student student2 = new Student(1, "Jack", 21, 75.5);

        Teacher teacher = new Teacher(3, "Oskar", 48, "OOP");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(teacher);
    }
}

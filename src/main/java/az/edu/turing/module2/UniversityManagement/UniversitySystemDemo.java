package az.edu.turing.module2.UniversityManagement;

import java.util.Arrays;

public class UniversitySystemDemo {
    public static void main(String[] args) {
        Student student = new Student("James", 17, "D981", "Math");
        Professor professor = new Professor("Jhon", 40, "BO21", "CS");
        Professor professor2 = new Professor("Jake", 35, "B1O2", "Math");
        professor2.addSubject("Physics");
        Course course = new Course("C001", "Introduction to JAVA", professor);
        University university = new University("Hogwarts");
        Course course2 = new Course("COO2", "Process Control", professor2);
        university.addCourse(course);
        university.addCourse(course2);
        student.enrollCourse(course);
        student.enrollCourse(course2);
        student.updateGrade(course, 100);
        student.updateGrade(course2, 80);
        course2.addStudent(student);
        course.addStudent(student);
        course.displayStudents();

    }
}
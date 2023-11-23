package Application;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Enter the student name:");
        student.name = sc.nextLine();

        System.out.println("1st grade:");
        student.grade1 = sc.nextDouble();

        System.out.println("2nd grade:");
        student.grade2 = sc.nextDouble();

        System.out.println("3rd grade:");
        student.grade3 = sc.nextDouble();

        if (student.finalGrade() < 60.0) {
            System.out.println("Final Grade: " + student.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("Final Grade: " + student.finalGrade());
            System.out.println("PASS");
        }
        sc.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    static Scanner scanner = new Scanner(System.in);
    String name;
    int am;
    int grade;
    static ArrayList<Integer> grades = new ArrayList<Integer>();
    static ArrayList<Integer> ams = new ArrayList<Integer>();
    public Student (String name, int am, int grade) {
        this.name = name;
        this.am = am;
        this.grade = grade;
    }

    public static void main(String[] args) {
        addStudents();
        sortGrades();
        showResults();
    }
    public static void addStudents() {
        System.out.println("How many students there are?");
        int numberStud = scanner.nextInt();
        scanner.nextLine();
        if (numberStud == 0) {
            return;
        } else {
            for (int i = 1; i <= numberStud; i++) {
                System.out.println("Give the " + i + " student's name");
                String name = scanner.nextLine();
                System.out.println("Give the " + i + " student's am");
                int am = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Give the " + i + " student's grade");
                int grade = scanner.nextInt();
                scanner.nextLine();
                ams.add(am);
                grades.add(grade);
                System.out.println("-------------");
                System.out.println(name);
                System.out.println(am);
                System.out.println(grade);
                System.out.println(ams);
                System.out.println(grades);
                System.out.println("-------------");
            }
        }
    }
    public static void sortGrades() {
        Collections.sort(grades);
    }
    public static void showResults() {
        System.out.println(grades);
    }
}
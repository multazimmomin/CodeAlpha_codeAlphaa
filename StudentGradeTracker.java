package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Student> students = new ArrayList<>();

            System.out.println("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter student name: ");
                String name = scanner.next();
                System.out.println("Enter student score: ");
                int score = scanner.nextInt();
                students.add(new Student(name, score));
            }

            double totalScore = 0;
            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;

            for (Student student : students) {
                totalScore += student.getScore();
                if (student.getScore() > highestScore) {
                    highestScore = student.getScore();
                }
                if (student.getScore() < lowestScore) {
                    lowestScore = student.getScore();
                }
            }

            double averageScore = totalScore / numStudents;

            System.out.println("Average score: " + averageScore);
            System.out.println("Highest score: " + highestScore);
            System.out.println("Lowest score: " + lowestScore);
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                sc.close();
                return;
            }

            total = total + marks;
        }

        double average = (double) total / subjects;

        System.out.println("\nTotal Marks = " + total);
        System.out.printf("Average Percentage = %.2f%%\n", average);

        if (average >= 90) {
            System.out.println("Grade = A+");
        } else if (average >= 80) {
            System.out.println("Grade = A");
        } else if (average >= 70) {
            System.out.println("Grade = B");
        } else if (average >= 60) {
            System.out.println("Grade = C");
        } else if (average >= 40) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F (Fail)");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int totalSubjects = sc.nextInt();
        int[] marks = new int[totalSubjects];
        System.out.print("Enter marks obtained in each subject  for out of 100 marks\n ");
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print(" subject " + (i + 1)+ ":");
            marks[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = (double) totalMarks / totalSubjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        }
         else if (averagePercentage >= 80) {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) {
            grade = 'C';
        }
         else if (averagePercentage >= 60) {
            grade = 'D';
        }
         else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}


package basicDataStructure;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marksStudent1A, marksStudent1B, marksStudent1C;
        int marksStudent2A, marksStudent2B, marksStudent2C;
        int marksStudent3A, marksStudent3B, marksStudent3C;

        System.out.println("Enter marks for Student 1 (A B C):");
        marksStudent1A = scanner.nextInt();
        marksStudent1B = scanner.nextInt();
        marksStudent1C = scanner.nextInt();

        System.out.println("Enter marks for Student 2 (A B C):");
        marksStudent2A = scanner.nextInt();
        marksStudent2B = scanner.nextInt();
        marksStudent2C = scanner.nextInt();

        System.out.println("Enter marks for Student 3 (A B C):");
        marksStudent3A = scanner.nextInt();
        marksStudent3B = scanner.nextInt();
        marksStudent3C = scanner.nextInt();

        int totalMarksStudent1 = marksStudent1A + marksStudent1B + marksStudent1C;
        int totalMarksStudent2 = marksStudent2A + marksStudent2B + marksStudent2C;
        int totalMarksStudent3 = marksStudent3A + marksStudent3B + marksStudent3C;

        double averageMarksStudent1 = (double) totalMarksStudent1 / 3;
        double averageMarksStudent2 = (double) totalMarksStudent2 / 3;
        double averageMarksStudent3 = (double) totalMarksStudent3 / 3;

        System.out.println("Student 1 Total Marks: " + totalMarksStudent1);
        System.out.println("Student 1 Average Marks: " + averageMarksStudent1);

        System.out.println("Student 2 Total Marks: " + totalMarksStudent2);
        System.out.println("Student 2 Average Marks: " + averageMarksStudent2);

        System.out.println("Student 3 Total Marks: " + totalMarksStudent3);
        System.out.println("Student 3 Average Marks: " + averageMarksStudent3);

        int totalSubjectA = marksStudent1A + marksStudent2A + marksStudent3A;
        int totalSubjectB = marksStudent1B + marksStudent2B + marksStudent3B;
        int totalSubjectC = marksStudent1C + marksStudent2C + marksStudent3C;

        double averageSubjectA = (double) totalSubjectA / 3;
        double averageSubjectB = (double) totalSubjectB / 3;
        double averageSubjectC = (double) totalSubjectC / 3;

        System.out.println("Subject A Total Marks: " + totalSubjectA);
        System.out.println("Subject A Average Marks: " + averageSubjectA);

        System.out.println("Subject B Total Marks: " + totalSubjectB);
        System.out.println("Subject B Average Marks: " + averageSubjectB);

        System.out.println("Subject C Total Marks: " + totalSubjectC);
        System.out.println("Subject C Average Marks: " + averageSubjectC);
    }
}


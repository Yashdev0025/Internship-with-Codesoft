import java.util.*;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        double avg = (double) total / n;
        char grade = (avg >= 90) ? 'A' :
                     (avg >= 80) ? 'B' :
                     (avg >= 70) ? 'C' :
                     (avg >= 60) ? 'D' : 'F';

        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
        sc.close();
    }
}

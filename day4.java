import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        String ans;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.printf("Enter Score: ");
                double score = sc.nextDouble();
                char grade = 'X'; // default value
                if (score < 0 || score > 100) {
                    System.out.println("Error: Score must be between 0 and 100!");
                } else if (score >= 90 && score <= 100) {
                    grade = 'A';
                } else if (score >= 80 && score <= 89) {
                    grade = 'B';
                } else if (score >= 70 && score <= 79) {
                    grade = 'C';
                } else if (score >= 60 && score <= 69) {
                    grade = 'D';
                } else if (score < 60) {
                    grade = 'F';
                } else {
                    System.out.println("Error: Invalid Inputs");
                }

                if (grade != 'X') {
                    switch (grade) {
                        case 'A':
                            System.out.printf("\nYou got a grade of %c for a score of %.2f\n", grade, score);
                            System.out.println("Remarks: You passed! Excellent!");
                            break;
                        case 'B':
                            System.out.printf("\nYou got a grade of %c for a score of %.2f\n", grade, score);
                            System.out.println("Remarks: You passed! Great!");
                            break;
                        case 'C':
                            System.out.printf("\nYou got a grade of %c for a score of %.2f\n", grade, score);
                            System.out.println("Remarks: You passed! Very Good!");
                            break;
                        case 'D':
                            System.out.printf("You got a grade of %c for a score of %.2f\n", grade, score);
                            System.out.println("\nRemarks: You failed! Improve more!");
                            break;
                        case 'F':
                            System.out.printf("\nYou got a grade of %c for a score of %.2f\n", grade, score);
                            System.out.println("Remarks: You failed! More Improvement!");
                            break;
                    }
                }

                System.out.printf("\nAgain?[y/n]: ");
                sc.nextLine();
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));

            System.out.println("Thank you!");
        }
    }
}

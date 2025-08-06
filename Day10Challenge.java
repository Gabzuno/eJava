import java.util.*;

public class Day10Challenge {
    public static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static void Grade(int average) {
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Initialize variables
            String ans;
            do {
                int students;
                System.out.println("╔══════════════════════════════╗");
                System.out.println("║    WELCOME TO STUDENT REG    ║");
                System.out.println("╚══════════════════════════════╝");
                System.out.print("Enter the number of students: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a number: ");
                    sc.next();
                }
                students = sc.nextInt();
                sc.nextLine(); // clear newline
                String[] names = new String[students];
                int[][] allScores = new int[students][3];
                for (int i = 0; i < students; i++) {
                    System.out.printf("\nStudent %d Name: ", i + 1);
                    names[i] = sc.nextLine();
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Quiz " + (j + 1) + " Score: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Invalid input. Please enter a number: ");
                            sc.next();
                        }
                        allScores[i][j] = sc.nextInt();
                        sc.nextLine();
                    }
                }
                System.out.println("\nResult:");
                for (int i = 0; i < students; i++) {
                    System.out.println("\nName: " + names[i]);
                    double avg = average(allScores[i]);
                    System.out.printf("Average Score: %.2f\n", avg);
                    Grade((int) avg);
                }

                System.out.print("\nDo you wanna try again? [y/n]: ");
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y")); // Infinite loop to keep asking for input until a valid one is provided
        } catch (

        Exception e) {
            System.out.println("\nAn error occurred: " + e.getMessage());
        }
        System.out.println("\nThank you for using the calculator!");
    }
}
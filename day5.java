import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double input, output;
            String ans;
            int row;
            // Looping Multiplication
            do {
                int num = 1;
                System.out.print("Enter a number: ");
                input = sc.nextDouble();
                for (int i = 1; i <= 10; i++) {
                    output = input * i;
                    System.out.printf("\n%.1f x %d = %.1f", input, i, output);
                }

                // Pattern
                System.out.print("\n\nEnter the number of rows: ");
                row = sc.nextInt();
                // number
                for (int j = 1; j <= row; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                System.out.println();
                // Inverted
                for (int j = row; j > 0; j--) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                // Floyd's Triangle
                for (int j = 1; j <= row; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print(num + " ");
                        num++;
                    }
                    System.out.println();
                }

                System.out.println();
                System.out.print("\nTry again? [y/n]: ");
                sc.nextLine();
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));
            System.out.println("Thank you!");
        }
    }
}

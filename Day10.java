import java.util.*;

public class Day10 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Initialize variables
            String ans;
            do {
                System.out.println("╔═══════════════════════════════╗");
                System.out.println("║       WELCOME TO CALCULATOR   ║");
                System.out.println("╚═══════════════════════════════╝");
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                System.out.println("\nSelect an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Modulus (%)");
                System.out.print("Enter your choice (1-5): ");
                int choice = sc.nextInt();
                int result = 0;
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        try {
                            double divisionResult = divide(num1, num2);
                            System.out.println("\nResult: " + num1 + " / " + num2 + " = " + divisionResult);
                        } catch (ArithmeticException e) {
                            System.out.println("\n⚠️ Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        result = modulus(num1, num2);
                        System.out.println("\nResult: " + num1 + " % " + num2 + " = " + result);
                        break;
                }
                sc.nextLine(); // clear newline
                System.out.print("Do you wanna try again? [y/n]: ");
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y")); // Infinite loop to keep asking for input until a valid one is provided
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
        System.out.println("\nThank you for using the program!");
    }
}

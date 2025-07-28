import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        String ans;
        // Simple Calculator
        try (
                Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Welcome to Simple Calculator");
                System.out.print("Please Enter your First number: ");
                double num1 = sc.nextDouble();
                System.out.print("Please Enter your Second number: ");
                double num2 = sc.nextDouble();
                System.out.print(
                        "Choose an operation:\n[1] Addition[+]\n[2] Subtraction[-]\n[3] Multiplication[*]\n[4] Division[/]\n[5] Modulo[%]\n\nEnter your choice: ");
                int choice = sc.nextInt();

                // Switch
                switch (choice) {
                    case 1:
                        System.out.println("You choose Addition");
                        double sum = num1 + num2;
                        System.out.printf("The sum of %.2f and %.2f is %.2f\n", num1, num2, sum);
                        break;
                    case 2:
                        System.out.println("You choose Subtraction");
                        double subs = num1 - num2;
                        System.out.printf("The difference of %.2f and %.2f is %.2f\n", num1, num2, subs);
                        break;
                    case 3:
                        System.out.println("You choose Multiplication");
                        double prod = num1 * num2;
                        System.out.printf("The product of %.2f and %.2f is %.2f\n", num1, num2, prod);
                        break;
                    case 4:
                        System.out.println("You choose Division");
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed!");
                        } else {
                            double quot = num1 / num2;
                            System.out.printf("The quotient of %.2f and %.2f is %.2f\n", num1, num2, quot);
                        }
                        break;
                    case 5:
                        System.out.println("You choose Modulo");
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("Error: Modulo by zero is not allowed!");
                        } else {
                            double mod = num1 % num2;
                            System.out.printf("The remainder of %.2f in %.2f is %.2f\n", num1, num2, mod);
                        }
                        break;
                    default:
                        System.out.println("Invalid Inputs\n");
                        break;
                }
                System.out.printf("Again? [y/n] ");
                sc.nextLine();
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));
            System.out.println("\nThank you for using the calculator!");
        }
    }
}

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        try (
                // practicing primitive data types
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to BMI Calculator");
            System.out.print("Please enter your Height(m): ");
            double height = sc.nextDouble();
            System.out.print("Please Enter your Weight(kg): ");
            double weight = sc.nextDouble();

            if (height <= 0 || weight <= 0) {
                System.out.println("Height and Weight must be positive numbers!");
                return;
            }

            double BMI = weight / (height * height);
            System.out.printf("Your BMI is %.2f\n", BMI);

            if (BMI >= 30) {
                System.out.println("You're in the Obese range!");
                System.out.println("Recommendation: Consult a healthcare provider.");
            } else if (BMI >= 25 && BMI < 30) {
                System.out.println("You're in the Overweight range!");
            } else if (BMI < 25 && BMI >= 18.5) {
                System.out.println("You're in the Normal range!");
            } else {
                System.out.println("You're in the Underweight range!");
            }

            sc.close();
        }
    }
}
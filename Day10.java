import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ans;
            do {

                System.out.print("Do you wanna try again? [y/n]: ");
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y")); // Infinite loop to keep asking for input until a valid one is provided
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
        System.out.println("\nThank you for using the program!");
    }
}

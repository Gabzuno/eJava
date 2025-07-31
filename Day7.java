import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ans, defuname = "zuno", defpass = "java123";
            String uname, pass;
            do {
                int attempt = 3;
                boolean success = false;

                while (attempt > 0) {
                    System.out.println("=====USER LOGIN======");
                    System.out.print("Enter username: ");
                    uname = sc.nextLine();

                    System.out.print("Enter Password: ");
                    pass = sc.nextLine();

                    if (uname.equalsIgnoreCase(defuname) && pass.equals(defpass)) {
                        System.out.println("\nLOGIN SUCCESSFUL!");
                        success = true;
                        break;
                    } else {
                        attempt -= 1;
                        System.out.println("\nLOGIN FAILED!");
                        System.out.println("Tries left: " + attempt);
                    }

                    if (!success) {
                        System.out.println("\nYou reached the max attempts!");
                    }
                }

                System.out.print("\nTry Again? [y/n]: ");
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));

            System.out.println("Thank you for trying!");
        } catch (Exception e) {
            System.out.println("Something went wrong, Try Again.");
        }
    }
}

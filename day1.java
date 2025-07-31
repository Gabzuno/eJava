import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        // Knewing the basics

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Hi, Can you give your name? ");
            String name = sc.nextLine();
            System.out.println("Welcome Ma'am/Sir " + name);
            System.out.print("How about your age? ");
            Integer age = sc.nextInt();
            // slight advance hehe
            if (age < 18) {
                System.out.println("Oh i see, still young!");
            } else if (age <= 20) {
                System.out.println("Ohhh that's nice, you're a young adult now!");
            } else {
                System.out.println("Wow, a senior i see!");
            }
            sc.nextLine();
            System.out.print("So tell me, What's the reason why you wanna start learning Java Programming?");
            String reason = sc.nextLine();
            boolean found = reason.toLowerCase().contains("improve");
            if (found) {
                System.out.println("That's great to know! Improving to become better!");
            } else {
                System.out.println("I understand, that's very good answer.");
            }

            System.out.printf(
                    "So, here's what you said if i'm correct.\n Your name is %s and you are %d years old.\n The reason why you started to leann java is %s. Is that right? ",
                    name, age, reason);
            String ans = sc.nextLine();
            if (ans.toLowerCase() == "yes") {
                sc.close();
            } else {
                System.out.println("\nSorry for that!");
            }
        }
    }
}
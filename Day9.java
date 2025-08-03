import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input, cleanedInput;

            System.out.println("🧠 Welcome to String Inspector 3000!");
            System.out.print("Enter a sentence: ");
            input = sc.nextLine();

            cleanedInput = input.replaceAll("\\s+", "").toLowerCase(); // Remove spaces + lowercase for analysis

            // 1. Upper and lower
            System.out.println("\n🔡 Uppercase: " + input.toUpperCase());
            System.out.println("🔠 Lowercase: " + input.toLowerCase());

            // 2. Reversed string
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("🔁 Reversed: " + reversed);

            // 3. Vowel and consonant count
            int vowels = 0, consonants = 0;
            for (char ch : cleanedInput.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("🟣 Vowels: " + vowels);
            System.out.println("🟢 Consonants: " + consonants);

            // 4. Check palindrome
            String checkPalindrome = cleanedInput;
            String reversedClean = new StringBuilder(checkPalindrome).reverse().toString();
            if (checkPalindrome.equals(reversedClean)) {
                System.out.println("✅ Palindrome: YES");
                System.out.println(checkPalindrome + " equals " + reversedClean);
            } else {
                System.out.println("❌ Palindrome: NO");
                System.out.println(checkPalindrome + " not equal to " + reversedClean);
            }

            // 5. Replace character
            System.out.print("\n🔁 Replace a character (from -> to): ");
            char from = sc.next().charAt(0);
            char to = sc.next().charAt(0);
            String replaced = input.replace(from, to);
            System.out.println("🔄 Replaced String: " + replaced);

            // 6. Trim whitespace
            System.out.println("🧹 Trimmed sentence: [" + input.trim() + "]");

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}

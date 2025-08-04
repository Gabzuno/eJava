import java.util.*;

public class Day9Challenge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String inputs, longestWord = null, shortestWord = null, result = "";
            int totalWords = 0;
            System.err.print("Enter a sentence: ");
            inputs = sc.nextLine();
            System.out.println("Total Characters (no spaces): " + inputs.trim().length());
            Map<String, Integer> wordFreq = new HashMap<>();
            for (String word : inputs.split(" ")) {
                if (word.length() > 0) {
                    totalWords++;
                    if (longestWord == null || word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                    if (shortestWord == null || word.length() < shortestWord.length()) {
                        shortestWord = word;
                    }
                    if (totalWords % 2 == 1) {
                        result += word.toUpperCase() + " ";
                    } else {
                        result += word.toLowerCase() + " ";
                    }
                    wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("Total Words: " + totalWords);
            System.out.println("Longest Word: " + longestWord);
            System.out.println("Shortest Word: " + shortestWord);
            System.out.println("Every other word in uppercase: " + result.trim());
            // Show word frequency
            System.out.println("\nWord Frequency:");
            System.out.println("\n╔═══════════════[ STATS ]═══════════════╗");
            for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
                showBar(entry.getKey(), entry.getValue());
            }
            System.out.println("╚═══════════════════════════════════════╝");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("⚠️ Error: " + e.getMessage());
        }
        // ...existing code...
    }

    // 📊 Visual bar generator
    public static void showBar(String label, int count) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < count; i++) {
            bar.append("█"); // full block bar
        }
        System.out.printf("║ %-8s → %2d  %s\n", label, count, bar.toString());
    }
}

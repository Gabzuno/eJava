import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ans;
            int rowList, positive, negative, even, odd, zero, min, max;

            do {
                positive = negative = even = odd = zero = 0;

                System.out.println("╔═══════════════════════════════╗");
                System.out.println("║     WELCOME TO DATA DASH     ║");
                System.out.println("╚═══════════════════════════════╝");

                System.out.print("\n▶ Enter number of elements: ");
                rowList = sc.nextInt();

                int[] lists = new int[rowList];

                for (int i = 0; i < rowList; i++) {
                    System.out.print("• Number " + (i + 1) + ": ");
                    lists[i] = sc.nextInt();
                }

                Map<Integer, Integer> freqMap = new HashMap<>();

                for (int num : lists) {
                    freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                    if (num > 0)
                        positive++;
                    if (num < 0)
                        negative++;
                    if (num == 0)
                        zero++;
                    if (num % 2 == 0)
                        even++;
                    else
                        odd++;
                }

                // Dashboard Header
                System.out.println("\n╔═══════════════[ STATS ]═══════════════╗");
                showBar("Positive", positive);
                showBar("Negative", negative);
                showBar("Zero    ", zero);
                showBar("Even    ", even);
                showBar("Odd     ", odd);
                System.out.println("╚═══════════════════════════════════════╝");

                sc.nextLine(); // clear newline
                System.out.print("\n🔎 Do you want to find all numbers in a specific index range? [y/n]: ");
                String ans2 = sc.nextLine();

                if (ans2.equalsIgnoreCase("y")) {
                    System.out.print("🔢 Enter min index: ");
                    min = sc.nextInt();
                    System.out.print("🔢 Enter max index: ");
                    max = sc.nextInt();

                    if (min >= 0 && max < lists.length && min <= max) {
                        System.out.print("📋 Numbers in range [" + min + " - " + max + "]: ");
                        for (int i = min; i <= max; i++) {
                            System.out.print(lists[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("⚠️ Invalid range! Use indexes between 0 and " + (lists.length - 1));
                    }
                    sc.nextLine(); // clear newline again
                }

                System.out.print("\n🔁 Try again? [y/n]: ");
                ans = sc.nextLine();

            } while (ans.equalsIgnoreCase("y"));

            System.out.println("\n🎉 Thank you!");
        } catch (Exception e) {
            System.out.println("❌ Something went wrong. Try again.");
        }
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

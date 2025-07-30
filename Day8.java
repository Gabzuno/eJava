import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ans, ans2;
            int rowList;
            int min, max;
            do {
                int positive = 0;
                int odd = 0, negative = 0;
                int even = 0, zero = 0;

                while (true) {
                    try {
                        System.out.print("\nEnter number of elements: ");
                        rowList = sc.nextInt();
                        if (rowList <= 0)
                            throw new Exception();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                        sc.nextLine();
                    }
                }

                int[] lists = new int[rowList];

                while (true) {
                    try {
                        for (int i = 0; i < rowList; i++) {
                            System.out.print("Number " + (i + 1) + ": ");
                            int inputs = sc.nextInt();
                            lists[i] = inputs;
                        }
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                        sc.nextLine();
                    }
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
                    else {
                        odd++;
                    }
                }

                // show the list value and frequencies
                // for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                // System.out.println("\nNumber: " + entry.getKey() + " -> Frequency: " +
                // entry.getValue());
                // }

                // for (int i = 0; i <= rowList; i++) {
                // System.out.println(lists[i]);
                // }

                System.out.println("\nPositive: " + positive);
                System.out.println("Negative: " + negative);
                System.out.println("Zero: " + zero);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);

                System.out.print("\nDo you want to find all numbers in a specific range? [y/n]: ");
                ans2 = sc.nextLine();
                if (ans2.equalsIgnoreCase("y")) {
                    System.out.print("\nEnter min: ");
                    min = sc.nextInt();
                    System.out.print("\nEnter max: ");
                    max = sc.nextInt();

                    // Removed invalid condition; instead, validate min and max range
                    if (min >= 0 && max < lists.length && min <= max) {
                        System.out.print("Numbers in range " + min + " to " + max + ": ");
                        for (int i = min; i <= max; i++) {
                            System.out.print(lists[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out
                                .println("Invalid range. Please enter min and max within 0 and " + (lists.length - 1));
                    }
                    sc.nextLine();
                }

                System.out.print("\nTry again? [y/n]");
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));
            System.out.println("Thank you for trying!");
        } catch (Exception e) {
            System.out.println("Something went wrong, try again.");
        }
    }
}

import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ans;

            do {
                int count = 0;
                boolean found = false;

                while (true) {
                    try {
                        System.out.print("Enter a array's length: ");
                        count = sc.nextInt();
                        sc.nextLine();
                        if (count <= 0)
                            throw new Exception();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                        sc.nextLine();
                    }
                }

                String[] words = new String[count];

                for (int i = 0; i < count; i++) {
                    System.out.print("Enter index " + (i + 1) + ": ");
                    words[i] = sc.nextLine();
                }

                System.out.println("\nYou entered: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(words[i] + " ");
                }

                System.out.print("\n\nSearch index value: ");
                String index = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (words[i].equals(index)) {
                        System.err.printf("\nThe value \"%s\" is in index %d", index, i);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Failed to find the value in the list");
                }

                int len = 0;
                while (true) {
                    try {
                        System.out.print("\nEnter length: ");
                        len = sc.nextInt();
                        if (len <= 0)
                            throw new Exception();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                        sc.nextLine();
                    }
                }

                int[] numbers = new int[len];

                for (int i = 0; i < len; i++) {
                    while (true) {
                        try {
                            System.out.print("value for " + (i + 1) + ": ");
                            numbers[i] = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid Input");
                            sc.nextLine();
                        }
                    }
                }

                Map<Integer, Integer> freqMap = new HashMap<>();

                for (int num : numbers) {
                    freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                }

                for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                    System.out.println("\nNumber: " + entry.getKey() + " -> Frequency: " + entry.getValue());
                }

                int sum = 0;
                int maxFreq = 0;
                int max = numbers[0];
                int min = numbers[0];
                int mode = numbers[0];
                double median = 0;

                for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                    if (entry.getValue() > maxFreq) {
                        maxFreq = entry.getValue();
                        mode = entry.getKey();
                    }
                }

                for (int i = 0; i < len; i++) {
                    sum += numbers[i];
                    if (numbers[i] > max)
                        max = numbers[i];
                    if (numbers[i] < min)
                        min = numbers[i];
                }

                Arrays.sort(numbers);

                if (len % 2 == 0) {
                    median = (numbers[len / 2 - 1] + numbers[len / 2]) / 2.0;
                } else {
                    median = numbers[len / 2];
                }

                double ave = (double) sum / len;

                System.out.println("\n------RESULTS------");
                System.out.println("\nSum: " + sum);
                System.out.println("\nMax: " + max);
                System.out.println("\nMin: " + min);
                System.out.println("\nMedian: " + (int) median);
                if (maxFreq == 1)
                    System.out.println("\nNo mode in the dataset");
                else
                    System.out.println("\nMode: " + mode + " (appeared " + maxFreq + " times)");
                System.out.print("\nAverage of ");
                for (int i = 0; i < len; i++) {
                    System.out.print(numbers[i]);
                    if (i < len - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.printf(" is %.2f", ave);
                System.out.print("\n\nTry again? [y/n]: ");
                sc.nextLine();
                ans = sc.nextLine();
            } while (ans.equalsIgnoreCase("y"));
            System.out.println("Thank you!");
        }
    }
}

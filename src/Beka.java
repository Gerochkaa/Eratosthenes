import java.util.Scanner;
import java.util.Arrays;

public class Beka {


   static class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            boolean[] table = new boolean[n + 1];
            Arrays.fill(table, true);

            // Loop up to square root of n
            for (int i = 2; i * i <= n; i++) {
                // If i is prime
                if (table[i]) {
                    // Mark all multiples of i as non-prime
                    for (int j = i * i; j <= n; j += i) {
                        table[j] = false;
                    }
                }
            }

            // Print prime numbers
            for (int i = 2; i <= n; i++) {
                if (table[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}



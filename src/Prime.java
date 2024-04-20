import java.util.Scanner;
public class Prime {
    static void sievePrintPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i*i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j = j + 1) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }

    }

}





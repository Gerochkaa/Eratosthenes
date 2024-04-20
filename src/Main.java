import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String args[]) {
        //Scanner class helps accepting user inputs. So accepting
        //and storing in variables.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Table that keeps track of all non prime numbers.
        boolean[] table = new boolean[n + 1];

        //Marking all the values in table.
        Arrays.fill(table, true);

        //Loop that
        for (int i = 2; i <= n; i++) {
            //If found value marked, then this is prime. So
            if (table[i]) {

                //Unmarking all its multiples.
                for (int j = i * 2; j <= n; j += i)
                    table[j] = false;

                // Print prime numbers
                for (i = 2; i <= n; i++) {
                    if (table[i]) {
                        System.out.print(i + " ");
                    }
                }


            }
        }
    }
}

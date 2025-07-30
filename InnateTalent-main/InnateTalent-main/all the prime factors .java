import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read input number

        for (int i = 2; i <= n; i++) {
            int count = 0;

            // While i divides n, count how many times
            while (n % i == 0) {
                count++;
                n /= i;
            }

            // If count > 0, then i is a prime factor
            if (count > 0) {
                System.out.println(i + "->" + count);
            }
        }
    }
}

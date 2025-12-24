import java.util.Scanner;

public class H_Honey_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        // Enumerate all possible factors a of n
        for (long a = 1; a * a * a <= n; a++) {
            if (n % a != 0) continue;

            long n1 = n / a;

            // Enumerate all factors b of n1
            for (long b = 1; b * b <= n1; b++) {
                if (n1 % b != 0) continue;

                long c = n1 / b;

                // Check divisibility constraints
                if (w % a == 0 && h % b == 0 && d % c == 0) {
                    System.out.println((a - 1) + " " + (b - 1) + " " + (c - 1));
                    return;
                }

                // Also check swapped b and c
                if (w % a == 0 && h % c == 0 && d % b == 0) {
                    System.out.println((a - 1) + " " + (c - 1) + " " + (b - 1));
                    return;
                }
            }
        }

        // If no valid split found
        System.out.println(-1);
    }
}

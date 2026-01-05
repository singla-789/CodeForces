import java.util.ArrayList;
import java.util.Scanner;

public class D_Christmas_Tree_Decoration {

        static final long MOD = 998244353;

    static long[][] C = new long[55][55];
    static long[] F = new long[55];

    static void preC() {
        for (int i = 0; i <= 50; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }
    }

    static void preF() {
        F[0] = 1;
        for (int i = 1; i <= 50; i++) {
            F[i] = (F[i - 1] * i) % MOD;
        }
    }

    static void help(Scanner sc) {
        int n = sc.nextInt();

        long[] a = new long[n + 1];
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        long k = sum / n;
        int r = (int)(sum % n);

        long[] d0 = new long[n + 1];
        long base = 0;
        ArrayList<Integer> ok = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            d0[i] = Math.max(0L, k - a[i]);
            base += d0[i];
            if (a[i] <= k) ok.add(i);
        }

        long f = a[0] - base;
        if (f < 0) {
            System.out.println(0);
            return;
        }

        int m = ok.size();
        long ways = 0;

        for (int x = 0; x <= Math.min(r, m); x++) {
            if (x <= f) {
                long cur = (C[m][x] * C[n - m][r - x]) % MOD;
                ways = (ways + cur) % MOD;
            }
        }

        long ans = ways;
        ans = (ans * F[r]) % MOD;
        ans = (ans * F[n - r]) % MOD;

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        preC();
        preF();

        int t = sc.nextInt();
        while (t-- > 0)help( sc);
    }
}
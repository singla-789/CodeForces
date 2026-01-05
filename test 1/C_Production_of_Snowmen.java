import java.util.*;

public class C_Production_of_Snowmen {
    static boolean help(int[] a, int[] b, int n, int d) {
        for (int i = 0; i < n; i++) {
            if (a[i] >= b[(i + d) % n]) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i =0;i<n;i++){
                b[i] = sc.nextInt();
            }

            for(int i =0;i<n;i++){
                c[i] = sc.nextInt();
            }


            long gAB = 0, gBC = 0;

            for (int d = 0; d < n; d++) {
                if (help(a, b, n, d)) gAB++;
                if (help(b, c, n, d)) gBC++;
            }

            long ans = (long) n * gAB * gBC;

            System.out.println(ans);
            
        }

        
    }
}
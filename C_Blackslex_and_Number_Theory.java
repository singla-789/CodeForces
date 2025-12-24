import java.util.*;

public class C_Blackslex_and_Number_Theory {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long m = arr[0];
            long sm = arr[1];
            long ans = m;

            if(sm-m<=m) ans =m;
            else ans = sm-m;

            System.out.println(ans);

        }
    }
}
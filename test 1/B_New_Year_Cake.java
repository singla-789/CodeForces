import java.util.Scanner;

public class B_New_Year_Cake {
    static int help(long white, long dark, boolean w) {
        int ans= 0;
        long size = 1;
        boolean isw = w;

        while (true) {
            if (isw) {
                if (white < size) break;
                white -= size;
            } else {
                if (dark < size) break;
                dark -= size;
            }
            ans++;
            size <<= 1;    
            isw = !isw; 
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            int ans = Math.max(
                help(a, b, true),   
                help(a, b, false)  
            );

            System.out.println(ans);

        }
        
    }
}
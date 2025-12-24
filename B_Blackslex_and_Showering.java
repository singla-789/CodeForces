import java.util.Scanner;
import java.util.*;

public class B_Blackslex_and_Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                arr[i] = a;
            }

            long total = 0;

            for(int i =0 ;i<n-1;i++){
                total += Math.abs(arr[i] - arr[i+1]);
            }

            int curr = Math.abs(arr[0] - arr[1]);
            curr = Math.max(curr,Math.abs(arr[n-1]-arr[n-2]));

            for(int i =1;i<n-1;i++){
                int a = Math.abs(arr[i] -arr[i-1] ) + Math.abs(arr[i] - arr[i+1]);
                int b = Math.abs(arr[i-1] - arr[i+1]);

                curr = Math.max(curr,a-b);
            }

            System.out.println(total - curr);
        }
    }
}
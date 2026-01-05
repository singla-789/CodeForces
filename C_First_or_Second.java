import java.util.Scanner;

public class C_First_or_Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            long ans =0;

            int f =0;
            int s = 1;

            for(int i=1;i<n;i++){
                if(arr[f]>=-arr[s]){
                    ans += arr[f];
                    f = s;
                    s = i+1;
                }else if( arr[f]<-arr[s]){
                    ans += -arr[s];
                    s = i+1;
                }
            }

            System.out.println(ans);

            

        }
    }
}
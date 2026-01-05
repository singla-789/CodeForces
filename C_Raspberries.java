import java.util.Scanner;

public class C_Raspberries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans =Integer.MAX_VALUE;
            int ec =0;
            for(int i =0;i<n;i++){
                int a = sc.nextInt();

                if(a%2==0) ec++;

                ans = Math.min(a%k,ans);
            }

            if(k==4){
                if(ec%2==0){
                    System.out.println(0);
                }else{
                    System.out.println();
                }
            }
            System.out.println(ans);
        }
    }
}
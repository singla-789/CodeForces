import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%2==0 && b%2==0){
                System.out.println(a*(b/2)+2);
            }
            else if(a%2==0 && b%2!=0){
                System.out.println("-1");
            }
            else if(a%2!=0 && b%2!=0){
                System.out.println((a*b)+1);
            }
            else{
                int ans = a*(b/2)+2;
                if(ans%2==0) System.out.println(ans);
                else System.out.println("-1");
            }
        }

        sc.close();
    }
}

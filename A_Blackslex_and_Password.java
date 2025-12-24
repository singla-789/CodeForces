import java.util.Scanner;

public class A_Blackslex_and_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int k = sc.nextInt();
            int x = sc.nextInt();
            
            int ans = k*x +1;

            System.out.println(ans);
        }

    }
}
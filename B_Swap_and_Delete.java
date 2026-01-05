import java.util.Scanner;

public class B_Swap_and_Delete {

    public static void solve(String s){
        int n = s.length(),n0=0,n1=0;

        for(char a : s.toCharArray()){
            if(a=='0') n0++;
            else n1++;
        }

        for(int i =0;i<n;i++){
            char a = s.charAt(i);

            if(a=='0') n1--;
            else n0--;

            if(n1<0||n0<0) {
                System.out.println(n-i);
                return;
            }
        }

        System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            solve(s);
        }
    }
}
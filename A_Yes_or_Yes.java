import java.util.Scanner;

public class A_Yes_or_Yes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            if(s.length()==1){
                System.out.println("YES");
                continue;
            }
            int y =0;

            for(char a : s.toCharArray()){
                if(a=='Y') y++;
            }

            if(y>1) System.out.println("NO");
            else System.out.println("YES");


        }
    }
}
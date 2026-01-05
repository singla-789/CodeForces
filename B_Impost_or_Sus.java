import java.util.Scanner;

public class B_Impost_or_Sus {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int ans =0;
            int g =0;
            int iu =0;
            int uf=0;
            int k =0;
            while(s.charAt(k) == 'u' && uf<n){
                uf++;
                iu++;
            }

            if(iu%2==0) ans += iu/2;
            else ans += (iu/2)+1;

            for(int i =uf+1;i<n;i++){
                char a = s.charAt(i);
                if(a=='u') g++;
                if(a == 's'){
                    if(g>=2){
                        if(g%2==0) ans += g/2 + 1;
                        else ans += (g/2);
                    }
                    g=0;
                }
            }

            if(g>0){
                if(g%2==0) ans += g/2;
                else ans += (g/2)+1;
            }



            if(g == n-1) ans += (g/2)+1;

            System.out.println(ans);
        }
    }
}





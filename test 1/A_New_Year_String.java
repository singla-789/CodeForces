import java.util.Scanner;

public class A_New_Year_String {

    public static int help(String s, int i) {
        String t = "2026";
        int count = 0;
        for (int j = 0; j < 4; j++) {
            if (s.charAt(i + j) != t.charAt(j)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans1 = 4;
            for (int i = 0; i <= n - 4; i++) {
                ans1 = Math.min(ans1, help(s, i));
            }

            StringBuilder x = new StringBuilder(s);
            int ans2 = 0;
            int p = x.indexOf("2025");

            while (p != -1) {
                ans2++;
                x.setCharAt(p + 3, '6');
                p = x.indexOf("2025");
            }

            System.out.println(Math.min(ans1, ans2));
        }
    }
}

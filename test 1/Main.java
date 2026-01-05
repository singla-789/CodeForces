import java.util.*;

public class Main {

    static class Fr {
        int x;
        long need;

        Fr(int x, long need) {
            this.x = x;
            this.need = need;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            long k = sc.nextLong();

            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            Fr[] fr = new Fr[n];
            long base = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                long y = sc.nextLong();
                long z = sc.nextLong();
                base += y;
                fr[i] = new Fr(x, z - y);
            }

            k -= base;
            if (k < 0) {
                System.out.println(0);
                continue;
            }

            Arrays.sort(b);
            Arrays.sort(fr, (p, q) -> p.x - q.x);

            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            int idx = 0;
            long ans = 0;

            for (int i = m - 1; i >= 0; i--) {
                int be = b[i];

                while (idx < n && fr[idx].x <= be) {
                    pq.add(fr[idx].need);
                    idx++;
                }

                if (!pq.isEmpty()) {
                    pq.poll();
                    ans++;
                }
            }

            ArrayList<Long> list = new ArrayList<>();
            while (idx < n) {
                list.add(fr[idx].need);
                idx++;
            }

            list.addAll(pq);
            Collections.sort(list);

            for (long cost : list) {
                if (k >= cost) {
                    k -= cost;
                    ans++;
                } else {
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}

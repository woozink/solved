package examplecollection;

import java.io.*;
import java.util.*;

public class PermutationAdd {
    static int n, k, cnt;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            num = new int[n];
            for (int idx = 0; idx < n; idx++) {
                num[idx] = Integer.parseInt(st.nextToken());
            }

            cnt = 0;
            solve(0, 0);
            System.out.println("#" + tc + " " + cnt);
        }

    }

    private static void solve(int idx, int sum) {
        if (sum == k) {
            cnt++;
            return;
        } else if (sum > k || idx >= n) {
            return;
        }
        solve(idx + 1, sum + num[idx]);
        solve(idx + 1, sum);
    }
}

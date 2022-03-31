package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tile06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 2];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        recur (dp,N);

        System.out.println(recur(dp, N));
    }

    public static int recur(int dp[], int N) {
        for (int i = 3; i < N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[N];
    }
}

package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver3 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');

        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int N) {
        //N에 대한 0 호출 횟수와 1 호출 횟수가 없을 때
        if (dp[N][0] == null || dp[N][1] == null) {
            //각 N에 대한 0호출 횟수와 1 호출 횟수를 재귀 호출한다.
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        //N에 대한 0과 1, 즉 [N][1]을 담고 있는 [N]을 변환한다.
        return dp[N];
    }
}

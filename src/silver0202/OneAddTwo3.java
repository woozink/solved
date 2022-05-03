package silver0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneAddTwo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] result = new long[n];
        long[] dp = new long[10000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int num = 0;
        for(int i = 0; i < n; i++){
            num = Integer.parseInt(br.readLine());

            if(num > 3){
                for(int j = 4; j <= num; j++){
                    dp[j] = (dp[j-1] + dp[j-2] + dp[j-3])%100000009;
                }
            }
            result[i] = dp[num];
        }
        for(long i : result){
            System.out.println(i);
        }
    }
}

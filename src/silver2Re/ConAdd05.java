package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConAdd05 {
    public static int N;
    public static int[] dp, cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        cost = new int[N+1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i<= N; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = cost[1];
        for(int i =2; i <=N; i++){
            dp[i] = Math.max(dp[i-1] + cost[i], cost[i]);
        }

        int max = Integer.MIN_VALUE;

        for(int i =1; i <= N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}

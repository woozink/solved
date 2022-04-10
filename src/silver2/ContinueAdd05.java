package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinueAdd05 {

    static int N;
    static int dp[],cost[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        cost = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i <= N; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for(int i = 1; i<= N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
            System.out.println(max);
        }
    }
}

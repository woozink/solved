package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestSeq03 {
    static int[] seq;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        seq = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i < N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // 0~ N-1 까지 탐색
        for(int i = 0; i <N; i++){
            LIS(i);
        }

        int max = dp[0];
        //최대값 찾기

        for(int i = 1; i < N; i++){
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

    static int LIS(int N){
        //탐색 x 위치
        if(dp[N]== null){
            dp[N] =1;
            //N-1 부터 0까지 중 N보다 작은 값들을 찾으면서 재귀 호출
            for(int i = N-1; i >= 0; i--){
                if(seq[i]<seq[N]){
                    dp[N] = Math.max(dp[N],LIS(i)+1);
                }
            }
        }
            return dp[N];

    }
}

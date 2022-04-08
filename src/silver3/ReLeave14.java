package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReLeave14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] t = new int[N];
        int[] p = new int[N];
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];
//        dp[0] = t[0] <= N ? p[0] : 0;
//        dp[1] = dp[0];
//        if((dp[0] != 0 && t[0] ==1) || t[0] >N) {
//            dp[1] += p[1];
//        }

        // 재귀로 바꾸기
        for(int i = 0; i < N; i++){
            int ti = t[i];
            int pi = p[i];
            int newTi = i + ti;
            if(newTi <= N){
                //날짜가 범위를 넘어가지 않는다면
                int newPi = dp[i] + pi;
                dp[newTi] = Math.max(dp[newTi], newPi);
            }else{
                //현재 날짜의 경우가 0일 수 있어서 이전의 최대값을 넣어줌
                //해당 날짜에 일할수 없다면, 이전까지 일한 최대 수당을 넣어줌
                dp[i+1] = Math.max(dp[i+1],dp[i]);
            }
        }
        System.out.println(dp[N]);
    }
}

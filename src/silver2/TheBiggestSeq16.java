package silver2;
// 수열 A가 주어졌을 때 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그래ㅑ믕ㄹ 잘성하시도
// dp로 푸는 문제였구나 .....
// dp ㅇ[는 각 원소에 가장 긴 증가 수열의 길이가 아니라 합을 담는다.
// 배열에 담는 원리는 현재 값이 이전 값보다 크먄+ map[i]해주는 원리이다.
// dp[i] = dp[i] + map[i]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class TheBiggestSeq16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] map = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }

        //dp :각 원소의 가장 큰 증가 부분 수열의 합
        //점화식 : dp[i] = max(dp[i] , dp[i-1] + map[i])
        dp[1] = map[1];

        int result = dp[1];
        for(int i =2; i <= n; i++){
            dp[i] = map[i];
            for(int j =1; j < i; j++){
                if(map[i] > map[j]){
                    dp[i] = Math.max(dp[i],dp[j] + map[i]);
                }
            }
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }

}

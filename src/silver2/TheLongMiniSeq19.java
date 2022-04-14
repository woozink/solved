package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheLongMiniSeq19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] dp = new int[N+1];

        StringTokenizer st =new StringTokenizer(br.readLine()," ");
        for(int i =1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;

        for(int i =2; i <= N; i++){
            dp[i] =1;
            for(int j =0; j < i; j++){
                if(arr[i] < arr[j] && dp[i] <=dp[j]){
                    dp[i] = dp[j] +1;
                }else if(arr[i] == arr[j]){
                    dp[i] = dp[j];
                }
            }
        }
        int max = 0;
        for(int i = 1; i <= N; i++){
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}

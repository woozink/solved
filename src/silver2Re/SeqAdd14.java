package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeqAdd14 {
    static int N, S;
    static int[] arr;
    static int ans =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        S= Integer.parseInt(st.nextToken());
        arr= new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);

        System.out.println(S == 0 ? ans -1 : ans);
    }

    public static void dfs (int dep, int sum){
        if(dep == N){
            if(sum == S){
                ans++;
            }return;
        }

        dfs(dep+1, sum +arr[dep]);
        dfs(dep +1, sum);
    }
}

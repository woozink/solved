package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FindParentByTree18 {
    static int N;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        parents = new int[N+1];
        check = new boolean[N+1];

        for(int i = 1; i<= N; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int j =1; j <N; j++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        for(int k = 1; k <=N; k++){
            if(!check[k]){
                dfs(k);
            }
        }
        for(int i = 2; i<=N; i++){
            System.out.println(parents[i]);
        }
    }

    private static void dfs(int v) {
        if(check[v]){
            return;
        }
        check[v] = true;
        for(int vv : list[v]){
            if(!check[vv]){
                parents[vv] = v;
                dfs(vv);
            }
        }
    }
}

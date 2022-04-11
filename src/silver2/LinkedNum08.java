package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinkedNum08 {
    static int [][] graph = new int[1001][1001];
    static int V;
    static int E;
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"");

        V= Integer.bitCount(st.countTokens());
        E= Integer.bitCount(st.countTokens());
        int a, b;

        for(int i = 0; i<E; i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());

            //간선 연결
            graph[a][b] = graph[b][a] =1;
        }
        int result = 0;
        for(int i = 1; i <= V; i++){
            if(visited[i] == false){
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }
    public static void dfs(int index){
        if(visited[index] == true){
            return;
        }
        else{
            visited[index] = true;
            for(int i = 1; i <= V; i ++){
                if(graph[index][i]== 1){
                    dfs(i);
                }
            }
        }
    }
}

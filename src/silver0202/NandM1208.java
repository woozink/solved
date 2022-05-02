package silver0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NandM1208 {
    static int n, m;
    static int[] arr, result;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        result = new int[m];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(1, 0);
        System.out.println(sb.toString());
    }

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int p : result) {
                sb.append(p).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            if (arr[i - 1] == arr[i]) continue; //중복 수열 x
            result[depth] = arr[i];
            dfs(i, depth + 1);
        }

    }
}



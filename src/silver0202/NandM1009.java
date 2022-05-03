package silver0202;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class NandM1009 {

    // package private: 같은 패키지 안에서만 접근 가
    private static int n, m;
    // private
    private static int[] arr, result;
    private static boolean[] visit;
    private static StringBuilder sb = new StringBuilder();
    private static LinkedHashSet<String> ans;

    public static void main(String[] args) throws IOException {
        // try-in-resource
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            arr = new int[n + 1];
            result = new int[m];
            visit = new boolean[n];
            ans = new LinkedHashSet<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            dfs(0, 0);
            ans.forEach(System.out::println);
        }
    }

    private static void dfs(int start, int depth) {
        if (depth == m) {
            StringBuilder sb = new StringBuilder();
            for (int p : result) {
                sb.append(p).append(" ");
            }
            ans.add(sb.toString());
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                visit[i] = false;

            }
        }
    }
}
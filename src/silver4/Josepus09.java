package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1158
public class Josepus09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder("<");

        while (!q.isEmpty()) {
            for (int j = 1; j <= K; j++) {
                if (j != K) {
                    q.offer(q.poll());
                } else {
                    sb.append(q.poll()).append(",");
                }
            }
        }
        String s = sb.substring(0, sb.length() - 2);
        sb = new StringBuilder(s);
        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}

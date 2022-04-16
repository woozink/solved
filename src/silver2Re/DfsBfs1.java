package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsBfs1 {
    public static int nodeCnt;
    public static LinkedList<Integer>[] nodeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        nodeCnt = Integer.parseInt(st.nextToken()); // 정점의 개수
        int lineCnt = Integer.parseInt(st.nextToken()); // 간선의 개수
        int startNode = Integer.parseInt(st.nextToken()); // 시작노드

        nodeList = new LinkedList[nodeCnt + 1]; //정점의 개수 +1개로 고정된 길이 주기

        for (int i = 0; i <= nodeCnt; i++) {
            nodeList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < lineCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            nodeList[node1].add(node2);
            nodeList[node2].add(node1);

            Collections.sort(nodeList[node1]);
            Collections.sort(nodeList[node2]);
        }

        StringBuilder dfsResult = new StringBuilder();
        StringBuilder bfsResult = new StringBuilder();

        boolean[] dfsVisited = new boolean[nodeCnt + 1];
        boolean[] bfsVisited = new boolean[nodeCnt + 1];

        dfs(startNode, dfsVisited,dfsResult);
        bfs(startNode, bfsVisited, bfsResult);

        System.out.println(dfsResult + "\n" + bfsResult);
    }

    public static void dfs(int node, boolean[] visited, StringBuilder sb) {
        if (visited[node]) return;

        visited[node] = true;
        sb.append(node + " ");
        for (int nextNode : nodeList[node]) {
            dfs(nextNode, visited, sb);
        }
    }

    public static void bfs(int node, boolean[] visited, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(node);

        while (!queue.isEmpty()) {
            node = queue.poll();

            if (visited[node]) continue;
            visited[node] = true;
            sb.append(node + " ");

            for (int nextNode : nodeList[node]) {
                queue.add(nextNode);
            }
        }
    }
}

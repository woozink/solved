package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cabbage02 {
    static int m; // 베추밭 가로길이
    static int n; // 베추밭 세로길이
    static int k; // 배추위치 개수

    static int[] dr = {1, 1, 0, 0}; // 상하좌우
    static int[] dc = {0, 0, -1, 1}; // 상하좌우

    static int[][] map; //배추밭
    static boolean[][] visit; // 방문체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= T; i++) {
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new int[m][n]; // 배추밭 크기 결정
            visit = new boolean[m][n]; // 방문 했는지 체크

            //배추밭에서 심어져있는 곳 입력
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                map[p1][p2] =1;
            }

            int count = 0; //구역수 지정

            for (int x = 0; x < m; x++) {
                for (int h = 0; h < n; h++) {
                    //배추가 있으면서 방문하지 않았으면 dfs 탐색하고 count(구역수) 1 증가
                    if (map[x][h] == 1 && !visit[x][h]) {
                        dfs(x, h);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int r, int c) {
        //방문체크
        visit[r][c] = true;

        //4방면 탐색
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            //범위 안에 있으면서
            if (nr >= 0 && nc >= 0 && nr < m && nc < n) {
                //배추가 있고, 방문을 하지 않았으면
                if (map[nr][nc] == 1 && !visit[nr][nc]) {
                    dfs(nr, nc);
                }
            }
        }
    }
}

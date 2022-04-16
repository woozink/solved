package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cabbage02 {
    public static int M; // 가로길이
    public static int N; // 세로길이
    public static int K; // 배추개수

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int[][] map; // 맵
    static boolean[][] visit; //방문 기록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int test = 1; test <= T; test++) {
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visit = new boolean[M][N];

            //배추밭에 심어져 있는 배추를 입력해주자
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int count = 0;

            //배추밭을 돌다가 1을 만나면 dfs를 통해서 상하좌우 탐색해주자
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    //배추 발견 그리고 방문한적 없으면 나이스 !
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int r, int c) {
        // 1. 방문 체크 부터 죠져주자
        visit[r][c] = true;

        //2. 방문체크 했으니까 그 주변에 있나 봐야지 그주변 전부 통틀어서 1개 되니까 (4방면)
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nc >= 0 && nr < M && nc < N) {
                //배추가 있고 방문하지 않으면 dfs 탐색
                if (map[nr][nc] == 1 && !visit[nr][nc]) {
                    dfs(nr, nc);
                }
            }
        }
    }
}

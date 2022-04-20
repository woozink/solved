package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Island10 {

    public static int w;
    public static int h;
    public static int[][] map;
    public static boolean[][] check;
    public static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    public static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            map = new int[h][w];
            check = new boolean[h][w];
            if (h == 0 && w == 0) {
                System.exit(0);
            } //종룍 조건

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            count = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !check[i][j]) {
                        Search(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void Search(int x, int y) {
        check[x][y] = true;

        //8방향 설정
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 안에 있고 배열 값이 1이고 true
            if (x >= 0 && y >= 0 && nx < h && ny < w) {
                if (map[nx][ny] == 1 && !check[nx][ny]) {
                    Search(nx, ny);
                }
            }
        }
    }
}

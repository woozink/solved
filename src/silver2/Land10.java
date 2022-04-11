package silver2;

import javax.crypto.SealedObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Land10 {

    static int W;
    static int H;
    static int[][] Map;
    static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
    static int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};
    static boolean[][] check;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if (W == 0 && H == 0) {
                System.exit(0);
            }
            Map = new int[H][W];
            check = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    Map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (Map[i][j] == 1 && !check[i][j]) {
                        Search(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void Search(int x,int y){
        check[x][y] = true;

        for(int i = 0; i <8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >= 0 && nx <H && ny <W){
                if(Map[nx][ny] ==1 && !check[nx][ny]) Search(nx,ny);
            }

        }
    }
}

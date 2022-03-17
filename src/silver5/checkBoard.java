package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1018
public class checkBoard {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];


        //배열 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }


    public static void find(int x, int y) {
        int count = 0;
        int end_y = y + 8;
        int end_x = x + 8;

        boolean TF = arr[x][y]; // 첫 번째 칸의 색

        for(int i = x; i <end_x; i++){
            for(int j=y; j <end_y; j++){

                //올바른 색이 아닌 경우 count +1
                if(arr[i][j] != TF){
                    count ++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);




    }
}

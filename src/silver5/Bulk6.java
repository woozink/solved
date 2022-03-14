package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/7568
public class Bulk6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[T][2];
        String[] str;

        for(int i = 0; i < T; i++){
           str = br.readLine().split(" ");
           arr[i][0] = Integer.parseInt(str[0]);
           arr[i][1] = Integer.parseInt(str[1]);
        }

        for (int i =0; i <T; i++){
            int rank = 1;

            for(int j = 0; j < T; j ++){
                if(i == j ) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append('\n');
        }
        System.out.println(sb);
    }
}

package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;

        for (int i = N - 1; i >= 0; i--) {
            //현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            if (arr[i] <= K) {
                count += (K / arr[i]);
                K = K % arr[i];
            }
        }
        System.out.println(count);
    }
}

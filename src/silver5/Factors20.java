package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1037
public class Factors20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);

        if (N != 1) {
            System.out.println(arr.get(0) * arr.get(N - 1));
        } else {
            System.out.println(arr.get(0) * arr.get(0));
        }

    }
}

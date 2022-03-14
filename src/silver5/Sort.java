package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://www.acmicpc.net/problem/2751
public class Sort {
    public static void main(String[] args) throws IOException {

        //arrays.sort = quick 정렬 -> 최악 복잡도 O(N2^2) 시간초과
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i =0; i < n; i++){
//            int x = Integer.parseInt(br.readLine());
//            arr[i] = x;
//        }
//        Arrays.sort(arr);
//        for(int i = 0; i < n; i ++){
//            System.out.println(arr[i]);
//        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int i = 0; i < n; i++){
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}

package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxValue13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int cnt = 1;

        for(int i = 0; i < 9; i++){
            arr[i] =Integer.parseInt(br.readLine());
        }
        int x = Arrays.stream(arr).max().getAsInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                break;
            }
            cnt++;
        }

        System.out.println(x);
        System.out.println(cnt);
    }
}

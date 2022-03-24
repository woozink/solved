package silver4;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNum06 {

    static int N,M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        //숫자를 받을 배열
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i <N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        M= Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i <M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            System.out.println(String.valueOf(binearySearch(tmp))+ "\n");
        }
    }
    static int binearySearch(int num){
        int start, mid, end;
        start = 0;
        end = N-1;
        while(start<= end){
            mid = (start + end)/2;
            int val = arr[mid];
            if(num == val) return 1;
            if(num > val){
                start = mid +1;
            }else{
                end = mid-1;
            }

        }
        return 0;
    }
}

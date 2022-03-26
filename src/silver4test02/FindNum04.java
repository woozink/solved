package silver4test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNum04 {

    static int N,M;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[N];

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< M; i++){
            int tmp = Integer.parseInt(st.nextToken());
        }
        System.out.println(String.valueOf(binarySearch(tmp)));
    }
    static int binarySearch(int num){
        int start, mid, end;
        start= 0;
        end = N-1;
        while(start <= end){
            mid = (start+end)/2;
            int val = array[mid];
            if (num == val) return 1;
            if(num > val){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return 0;
    }
}

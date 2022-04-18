package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beterang06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int N = Integer.parseInt(br.readLine());

            if(N==0){
                break;
            }
            boolean arr[] = new boolean[2*N+1];

            arr[0] = true;
            arr[1] = true;

            for(int i =2; i <= Math.sqrt(2*N+1); i++){
                for(int j = i*i; i <2*N+1; i++){
                    arr[j] = true;
                }
            }
            int cnt = 0;
            for(int i = N+1; i <2*N+1; i++){
                if(arr[i] == false){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

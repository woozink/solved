package silver4test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sosu02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        if(n ==1) return false;

        for(int i=2; i <=Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}

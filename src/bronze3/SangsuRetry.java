package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SangsuRetry {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int reverseA = reverseNumber(a);
        int reverseB = reverseNumber(b);

        if(reverseA >reverseB){
            System.out.println(reverseA);
        }else{
            System.out.println(reverseB);
        }
    }
    
    private static int reverseNumber(int originalNumber){
        int reversedNumber = 0;
        while(originalNumber !=0){
            int digit = originalNumber %10;
            originalNumber = originalNumber *10 + digit;
            reversedNumber/= 10;
        }
        return reversedNumber;
    }
}

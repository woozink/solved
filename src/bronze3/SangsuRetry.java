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
        int reverseA =0;
        int reverseB = 0;

        while(a !=0){
            int digit = a %10;
            reverseA = reverseA *10 + digit;
            a/= 10;
        }

        while(b !=0){
            int digit = b %10;
            reverseB = reverseB *10 + digit;
            b/= 10;
        }

        if(reverseA >reverseB){
            System.out.println(reverseA);
        }else{
            System.out.println(reverseB);
        }
    }
}

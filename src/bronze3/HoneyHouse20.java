package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyHouse20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;

        if(n ==1 ){
            System.out.println(1);
        }else{
            while(range <= n){
                range = range +(count * 6);
                count++;
            }
            System.out.println(count);
        }
    }
}

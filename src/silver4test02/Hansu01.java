package silver4test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(sequence(Integer.parseInt(br.readLine())));
    }
    public static int sequence(int n) {
        int count =0;

        if(n < 100){
            return n;
        }
        else{
            count = 99;
            if(n == 1000){
                n =999;
            }
            for(int i =0; i<= n; i++){
                int hun = i /100;
                int ten = (i /10) %10;
                int one = i % 10;
                if((hun -ten) == (ten - one)){
                    count++;
                }
            }
        }
        return count;
    }
}

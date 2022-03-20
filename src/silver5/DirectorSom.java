package silver5;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1436
public class DirectorSom {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num =666;


        while(count != N){
            num ++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}

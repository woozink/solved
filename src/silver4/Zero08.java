package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < T; i++){
            int x = Integer.parseInt(br.readLine());
            if(x ==0){
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        int sum = 0;

        for (int num : stack){
            sum += num;
        }
        System.out.println(sum);
    }
}

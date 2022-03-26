package silver4test02;

import javax.imageio.event.IIOReadProgressListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Gwalho03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            sb.append(solve(br.readLine())).append('\n');
        }
    }
    public static String solve(String s){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);


            //여는 괄호일 경우 스택에 넣는다.
            if(c == '('){
                stack.push(c);
            }

            else if(stack.empty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "Yes";
        }else{
            return "NO";
        }
    }
}

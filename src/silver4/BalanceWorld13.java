package silver4;
//https://www.acmicpc.net/problem/4949
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalanceWorld13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();


        while (true) {
            s = br.readLine();

            if (s.equals(".")) {
                break;
            }

            sb.append(solve(s)).append("\n");
        }

        System.out.println(sb);
    }

    public static String solve(String s){

        Stack<Character> stack = new Stack<Character>();

        for(int i =0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c == '(' || c == '['){
                stack.push(c);
            }

            else if(c == ')'){
                if(stack.empty() || stack.peek() == '['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }

            else if(c == ']'){
                if(stack.empty() || stack.peek() == '('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
        }

        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}

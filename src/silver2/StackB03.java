package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackB03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int mul = 1;
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {

                case '(':
                    stack.push('(');
                    mul *= 2;
                    break;
                case '[':
                    stack.push('[');
                    mul *= 3;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = 0;
                        break;
                    }
                    if (n.charAt(i - 1) == '(') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 2;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = 0;
                        break;
                    }
                    if (n.charAt(i - 1) == '[') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 3;
                    break;
            }
        }
        System.out.println(!stack.isEmpty()? 0 : result);
    }
}

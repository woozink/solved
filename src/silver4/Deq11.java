package silver4;
//https://www.acmicpc.net/problem/10866

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Deq11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        for(int i =0; i < N; i++){
            String[] s = br.readLine().split(" ");

            switch (s[0]){
                case "push_front" : {
                    dq.addFirst(Integer.parseInt(s[1]));
                    break;
                }
                case "push_back" : {
                    dq.addLast(Integer.parseInt(s[1]));
                    break;
                }
                case "pop_front" : {
                    if(dq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        dq.pollFirst();
                    }
                }
                case "pop_back" : {
                    if(dq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        dq.pollLast();
                    }
                }
                case "size" : {
                  sb.append(dq.size()).append('\n');
                  break;
                }
                case "empty" : {
                    if(dq.isEmpty()){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                }
                case "front" : {
                    if(dq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(dq.peekFirst()).append('\n');
                    }
                }
                case "back" : {
                    if(dq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(dq.peekLast()).append('\n');
                    }
                }
            }
        }
        System.out.println(sb);
    }
}

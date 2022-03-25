package silver4;
//https://www.acmicpc.net/problem/2164

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 1; i <= N; i++){
            q.add(i);
        }

        while(true){
            if(q.size() == 1){
                break;
            }
            else{
                for(int i =1; i<=2; i++){
                    if(i ==1){
                        q.remove();
                    }
                    else{
                        q.offer(q.poll());
                    }
                }
            }
        }
        System.out.println(q.peek());
    }
}

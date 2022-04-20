package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumHeap13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        int val = 0;

        for(int i = 0; i < n; i ++){
            val = Integer.parseInt(br.readLine());
            if(val != 0){
                q.add(val);
            }else if(q.isEmpty()){
                System.out.println("0");
            }else{
                System.out.println(q.poll());
            }
        }
    }
}


package silver2;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumHeap14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int val = Integer.parseInt(br.readLine());

            if(val ==0){
                if(q.isEmpty()) System.out.println("0");
                else{
                    System.out.println(q.poll());
                }
            }else{
                q.add(val);
            }
        }
    }
}

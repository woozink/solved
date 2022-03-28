package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class RotationQ16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        LinkedList<Integer> dequeue = new LinkedList<Integer>();

        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            dequeue.offer(i);
        }

        int[] seq = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int targetIdx = dequeue.indexOf(seq[i]);
            int halfIdx;

            //짝수 & 홀수 구분
            if (dequeue.size() % 2 == 0) {
                halfIdx = dequeue.size() / 2 - 1;
            } else {
                halfIdx = dequeue.size() /2;
            }

            //중간지점 또는 중간지점 보다 앞에 있는 경우
            if(targetIdx <= halfIdx){
                for(int j =0; j < targetIdx; j++){
                    int tmp = dequeue.pollFirst();
                    dequeue.offerLast(tmp);
                    count++;
                }
            }else{
                for(int j = 0; j< dequeue.size() -targetIdx; j++){
                    int tmp = dequeue.pollLast();
                    dequeue.offerFirst(tmp);
                    count ++;
                }
            }
            dequeue.pollFirst();
        }
        System.out.println(count);
    }
}

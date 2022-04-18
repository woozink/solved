package silver2Re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lostbr07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        while(st.hasMoreTokens()){
            int temp = 0;

            // 뺄샘으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(st.nextToken(),"+");

            //덧샘으로 나뉜 토큰들을 모두 더한다.
            while(addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }

            //첫 번째 토큰인 경우 temp 값이 첫 번째 수가 됨
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}

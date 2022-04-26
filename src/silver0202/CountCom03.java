package silver0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountCom03 {
    public static int n, m;
    public static long five, two;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        five = 0;
        two = 0;

        five = fiveCount(n);
        two = twoCount(n);

        five -= fiveCount(n-m);
        five -= fiveCount(m);

        two -= twoCount(n-m);
        two -= twoCount(m);
        System.out.println(five <= two ? five : two);
    }

    public static long fiveCount(long n){
        long cnt =0;

        for(long i = 5; i<=n; i*=5){
            cnt += n / i;
        }
        return cnt;
    }

    public static long twoCount(long n){
        long cnt =0;

        for(long i = 2; i<=n; i*=2){
            cnt += n / i;
        }
        return cnt;
    }
}

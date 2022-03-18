package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2609
public class GCD5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x = gcd(a,b);
        System.out.println(x);
        System.out.println(a*b/x);
    }

    public static int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        return gcd(b, a%b);
    }
}

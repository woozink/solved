package samsungd2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Billion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T ; i++) {
            int N = Integer.parseInt(br.readLine()), max = 0;
            long result = 0;
            int [] input = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) input[j] = Integer.parseInt(st.nextToken());
            for (int j = N-1; j >= 0; j--) {
                if(max < input[j]) max = input[j];
                else if(max > input[j]) result += max - input[j];
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.println(sb);
    }
}
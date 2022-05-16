import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(str.nextToken());
    for (int tc = 1; tc <= T; tc++) {
        str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        String[] valArr = new String[N];
        int[] numArr = new int[N];
        for(int i=0; i<N; i++){
            str = new StringTokenizer(br.readLine());
            valArr[i] = str.nextToken();
            numArr[i] = Integer.parseInt(str.nextToken());
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<numArr[i]; j++){
                sb.append(valArr[i]);
            }
        }
        System.out.println("#"+tc);
        for(int k=1; k<=sb.length(); k++){
            System.out.print(""+sb.charAt(k-1));
            if(k%10== 0)  System.out.println();
        }
        sb.delete(0,sb.length());
        System.out.println();
    }
}
}
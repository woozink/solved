package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 1;
        for(byte value : str.getBytes()){
            if(value == ' '){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

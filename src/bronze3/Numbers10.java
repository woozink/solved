package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine()) *Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String str = String.valueOf(val);

        int arr[] = new int[10];

        for(int i = 0; i < str.length(); i ++){
            arr[(str.charAt(i)-48)]++;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}

package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WordArr21 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] arr = new String[s.length()];
        //입력 Strin 크기만큼 배열 생성
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.substring(i, s.length());
        }
        Arrays.sort(arr);
        for (String str : arr) {
            System.out.println(str);
        }

    }
}

package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n; i++){
            sb.append(str[i][0]).append(" ").append(str[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}

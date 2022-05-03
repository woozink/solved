package silver0202;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class NandM11 {
    static int n, r;
    static int[] num;
    static int[] arr;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        num = new int[r];
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        bt(0);
        StringBuilder sb = new StringBuilder();
        set.stream().forEach(i -> sb.append(i));
        System.out.print(sb);
    }

    static void bt(int depth) {
        if (depth == r) {
            String str = "";
            for (int i : num) str += i + " ";
            set.add(str + "\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            num[depth] = arr[i];
            bt(depth + 1);
        }
    }
}



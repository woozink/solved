package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartLink09 {
    static int size;
    static int arr[][];
    static boolean visit[];
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        size = Integer.parseInt(st.nextToken());
        arr = new int[size][size];
        visit = new boolean[size];

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        choiceTeam(0, 0);

        System.out.println(min);
    }

    static void choiceTeam(int start, int count) {
        if (count == size / 2) {
            diffSum();
            return;
        }
        for (int i = start; i < size; i++) {
            if (visit[i]) continue;
            visit[i] = true;
            choiceTeam(i + 1, count + 1);
            visit[i] = false;
        }
    }

    static void diffSum() {
        int sumStart = 0, sumLink = 0;

        //visit이 true 이면 start팀 false 이면 Link팀

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (visit[i] == true && visit[j] == true) {
                    sumStart += arr[i][j];
                    sumLink += arr[j][i];
                }
            }
        }
        int result = Math.abs(sumStart - sumLink);

        if (min > result)
            min = result;
    }

}

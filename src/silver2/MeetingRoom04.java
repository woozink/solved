package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // 배열 선언
        int[][] arr = new int[N][2];
        StringTokenizer st;
        //배열 입력
        // [i][0]은 시작 시간 [i][1]은 종료 시간
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //0 번 인덱스 기준으로 (시작시간) 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        // 1번 인덱스를 기준으로 (종료시간) 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int endTime = 0;

        //시작시간이 endTime 보다 크거나 같으면 endTime 을 그 행의 끝나는 시간으로 두고 count 증가
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= endTime) {
                endTime = arr[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}

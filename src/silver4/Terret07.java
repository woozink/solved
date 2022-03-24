package silver4;
//https://www.acmicpc.net/problem/1002


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Terret07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(tangentPoint(x1,y1,r1,x2,y2,r2)).append("\n");
        }
        System.out.println(sb);
    }

    public static int tangentPoint(int x1,int y1,int r1,int x2,int y2,int r2){
        int distancePow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 1. 중점이 같으면서 반지름이 같을 때
        if(x1 == x2 && y1 == y2 && r1 == r2){
            return -1;
        }
        // 2-1. 두 원의 반지름 합보다 중점간 거리가 더 길 떄
        else if(distancePow > Math.pow(r1 +r2,2)){
            return 0;
        }
        // 2-2. 원 안에 원이 있으나 내접 하지 않을 때
        else if(distancePow < Math.pow(r2-r1 , 2)){
            return 0;
        }
        // 3-1. 내접
        else if(distancePow == Math.pow(r2-r1,2)){
            return 1;
        }
        // 3-2. 외접
        else if(distancePow == Math.pow(r2+r1,2)){
            return 1;
        }
        // 나머지
        else{
            return 2;
        }

    }
}

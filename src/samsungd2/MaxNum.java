package samsungd2;

import java.util.Scanner;

class MaxNum {
    public static void main(String args[]) throws Exception {

        //System.setIn(new FileInputStream("res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int test = sc.nextInt();
            int[] scoreNum = new int[101];
            int ans = 0;
            int max = 0;
            for (int i = 0; i < 1000; i++) {
                int temp = sc.nextInt();
                scoreNum[temp] += 1;
                if (max < scoreNum[temp]) {
                    max = scoreNum[temp];
                    ans = temp;
                } else if (max == scoreNum[temp]) {
                    ans = Math.max(ans, temp);
                }
            }
            System.out.println("#" + test + " " + ans);
        }
    }
}

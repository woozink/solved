package silver5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1316
public class GroupChecker {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean check() throws IOException{
        boolean []check = new boolean[26];

        String str = br.readLine();
        int prev = 0;

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i);

            if(now != prev){
                if(check[now - 'a'] == false) {// 처음 나오는 놈
                    check[now - 'a'] = true;
                    prev = now;
                }else{ // 처음 나오지 않은 놈 < 다시 말해서 이전에 나왔던 전적이 있는 놈>
                    return false;
                }
            }else{ // 이전 값하고 지금 값이 연속해서 똑같이 나왔을 때!
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < T; i++){
            if(check()==true){
                count ++;
            }
        }
        System.out.println(count);

    }
}

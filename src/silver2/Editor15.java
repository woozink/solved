package silver2;
// ㅎㅏㄴ줄로 된 간단한 에디터를 구현
// 영어 소문자만 기록 할 수 있는 편집기로
// 최대 600000 6십만개
// 커서 존재 문장의 맨 앞, 문장의 맨 뒤, 문장 중간 임의 곳모든 연속 연속된 문자 사이
// L 커서를 왼쪽으로 한 칸 옮김
// D 커서를 오른쪽으로 한 칸 옮김
// B 커서 왼쪽에 있는 문자를 삭제함
// 삭제로 인해 커서는 한 칸 왼쪽으로 이동하는 것처럼 나타남
// P$ $라는 문자를 커서 왼쪽에 추가함

// 첫째줄에 초기에 편집기에 입력 되엉 있는 문자열이 주어진다.
// N이고 영어 소문자 100000 을 넘지 않는다.
// 둘째 줄에는 입력할 명령어의 개수를 나타내는 정수 M
// 셋째줄에는 M개의 줄에 걸쳐 입력한 명령어가 순서대로 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack stL = new Stack();
        Stack stR = new Stack();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            stL.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String com = br.readLine();
            if (com.equals("L")) {
                if (!stL.empty()) {
                    stR.push(stL.pop());
                }
            }else if(com.equals("D")){
                if(!stR.empty()){
                    stL.push(stR.pop());
                }
            }else if(com.equals("B")){
                if(!stL.empty()){
                    stL.pop();
                }
            }else if(com.contains("P")){
                char c = com.charAt(2);
                stL.push(c);
            }
        }
        while(!stL.empty()){
            stR.push(stL.pop());
        }
        while(!stR.empty()){
            System.out.print(stR.pop());
        }
    }
}

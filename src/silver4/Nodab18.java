package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Nodab18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Set<String> set = new HashSet<String>();
        List<String> result = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N;i++){
            set.add(br.readLine());
        }

        for(int i = 0; i < M; i++){
            String person = br.readLine();
            if(set.contains(person)){
                result.add(person);
            }
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(result);

        for(String str : result){
            sb.append(str+"\n");
        }

        System.out.println(sb.toString());
    }
}

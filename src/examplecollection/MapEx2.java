package examplecollection;

import java.util.*;
import java.util.stream.Collectors;

// 파라미터로 전달받은 배열의 요소를 for문을 통해서 가져와 HashMap의 Key로 사용하고 같은
// key가 반복 될 때마다 value를 1씩 증가시켜준다.
// 따라서 for문을 완전히 수행했을 때 HashMap의 key값에는 주어진 배열에 있는 요소들의
// 종류가 들어갈 것이고, value 에는 각 종류별 중복 횟수가 카운팅 될것입니다.


public class MapEx2 {
    public static String[] solve(String[] movies) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < movies.length; i++) {
            if (m.containsKey(movies[i])) {
                int cnt = m.get(movies[i]);
                cnt++;
                m.put(movies[i], cnt);
            } else {
                m.put(movies[i], 1);
            }
        }
        //
        // key - value
        //
        // spy - 3
        // ray - 2
        // room - 1
        // once - 2


        return m.entrySet().stream()
                .sorted((e1,e2)-> {
                    if(e1.getValue() != e2.getValue()) {
                        return e2.getValue() - e1.getValue();
                    }else {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                })
                .map(e->e.getKey())
                .collect(Collectors.toList())
                .toArray(new String[m.size()]);
    }

    public static void main(String[] args) {

        String[] x = solve(new String[]{"spy", "ray", "spy", "room", "once", "ray", "spy", "once", "room", "room", "room"});
        System.out.println(x.toString());
    }
}


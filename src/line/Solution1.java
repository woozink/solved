package line;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Solution1 {
    private static String[] solution(String[] logs) {
        Map<String, Integer> nameMap = new HashMap<>();
        Map<String, Integer> titleMap = new HashMap<>();

        int n = logs.length;
        String[] name = new String[n];
        String[] title = new String[n];

        for (int i = 0; i < logs.length; i++) {
            String[] arr = logs[i].split(" ");
            name[i] = arr[0];
            title[i] = arr[1];
        }
        for (int i = 0; i < logs.length; i++) {
            nameMap.put(name[i], 1);
        }

        for (int i = 0; i < logs.length; i++) {
            if (titleMap.containsKey(title[i])) {
                int cnt = titleMap.get(title[i]);
                cnt++;
                titleMap.put(title[i], cnt);
            } else {
                titleMap.put(logs[i], 1);
            }
        }

        return titleMap.entrySet().stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() != e2.getValue()) {
                        return e2.getValue() - e1.getValue();
                    } else {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                })
                .map(e -> e.getKey())
                .collect(Collectors.toList())
                .toArray(new String[titleMap.size()]);
    }
}



public static void main(String[]args)throws IOException{

        }
        }

package examplecollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args){
        // Map<Key : Value> value의 자료형이 Object라 모든 Object는 다들어갈 수 있다.
        Map<String,Integer> map = new HashMap<String, Integer>();

        // Map에 문자열을 넣는다.
        //map.put("testStr","테스트데이터 입니다.");

        //Map에 정수를 넣는다.
        map.put("testInt", 1234567);

        System.out.println("문자열 데이터 표출 : " + map.get("testStr"));
        System.out.println("정수형 데이터 표출 : " + map.get("testInt"));

        System.out.println("자료형 : " + map.get("testStr").getClass().getName());
        System.out.println("자료형 : " + map.get("testInt").getClass().getName());

        // map 데이터를 문자열에 셋팅
        String setStr = map.get("testStr").toString();

        //map 데이터를 Int에 셋팅
        int setInt = (int)map.get("testInt");


    }
}

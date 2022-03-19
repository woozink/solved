package silver5test01;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2941
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = 0;
        int len = str.length();
        for(int i = 0; i < len; i++){
           char ch = str.charAt(i);

           if (ch == 'c' && i < len-1){
               //만약 ch  다음 문자가 '=' 또는 '-'이면 ?
               if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                   i++;
               }
           }else if(ch == 'd' && i < len -1){
               if(str.charAt(i+1) == '-'){
                   i++;
               }
               else if(str.charAt(i+1)== 'z' && i <len -2){
                   if(str.charAt(i+2) == '='){
                       i+=2;
                   }
               }
           }
           else if(ch =='l' || ch == 'n' && i < len -1){
               if(str.charAt(i+1) == 'j'){
                   i++;
               }
           }
           else if(ch == 's' || ch =='z' && i <len -1){
               if(str.charAt(i+1) == '='){
                   i++;
               }
           }
           count ++;
        }
        System.out.println(count);
    }

}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Nc1 {
//    public static String[] arr;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int count [] = new int[N];
//        arr = new String[N];
//        for(int i = 0; i < N; i++){
//            arr[i] = br.readLine();
//        }
//        Arrays.sort(arr);
//
//        for(int i = 0; i < N-1; i++){
//            if(arr[i] == arr[i+1]){
//                count[i]++;
//            }else{
//                continue;
//            }
//        }
//        for(int i = 0; i < N; i++){
//            System.out.println(count[i]);
//        }
//
//
//
//    }
//
////    public String[] solution(String[] movie){
////        String[] ans = {};
////        return ans;
////    }
//
//
//}

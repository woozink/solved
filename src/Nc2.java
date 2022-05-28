//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Nc2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] birth = new String[N];
//        for (int i = 0; i < N; i++) {
//            birth[i] = br.readLine();
//        }
//
//        int a = solution(birth);
//        System.out.println(a);
//
//    }
//
//    public static int solution(String[] birth) {
//        int ans = 0;
//
//
//        for (int i = 0; i < birth.length; i++) {
//            String yearStr = birth[i].substring(0, 3);
//            String monthStr = birth[i].substring(4, 6);
//            String dayStr = birth[i].substring(6, 8);
//            int year = Integer.valueOf(arr[i]);
//            int month = Integer.valueOf(arr1[i]);
//            int day = Integer.valueOf(arr2[i]);
//
//            if (arr[i].length() != 4) {
//                continue;
//            } else if (a < 1900 && a > 2021) {
//                break;
//            } else if(arr1[i].length() !=2){
//                break;
//            }else if(a == 01 || 03 || 05 || 07 || 08 || 10 || 12){
//                if(c < 01 && c >31) {
//                    break;
//                }
//            }
//
//        }
//
//
//        return ans;
//
//
//    }
//}

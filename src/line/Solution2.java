package line;

public class Solution2 {
    public static void main(String[] args) {

    }

    public int solution(int n, int[] times) {
        int [] cnt = new int[times.length];
        int now =1;
        int result =0;

        for(int i =0; i < times.length; i++){

        }
        while(true){
            if(n==now){
                break;
            }
            if(now == 1){
               now = 2;
               cnt[0] += times[0];
               continue;
            }
            if(n >= now*2){
                now *= 2;
                cnt[1] += times[1];
            }
            if(n < now*2){
                if(
            }
        }
    }

}

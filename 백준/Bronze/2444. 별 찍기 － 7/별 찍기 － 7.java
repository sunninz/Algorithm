import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        /**
         * 1번째 줄 -> 공백4개 별 1개
         * 2번째 줄 -> 공백 3개 별 3개
         * 3번째 줄 -> 공백 2개 별 5개
         * 4번째 줄 -> 공백 1개 별 7개
         * 5번째 줄 -> 공백 x 별 9개
         * 공백 5-i & 별 (2i-1)
         * 6줄 -> |5-i| ,
         * if -> i<=n  공백 5-i & 별 (2i-1)
         * else -> i>n 공백 i-5 & 별 (2(5-i)-1)
         */


        for(int i=1; i <= (2*n-1); i++){
            int k = Math.abs(n-i);

            for(int j = 1;j <= k; j++){
                System.out.print(" ");
            }
            for(int j =1; j <= 2*(n-k)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        br.close();
        bw.flush();
        bw.close();
    }

}

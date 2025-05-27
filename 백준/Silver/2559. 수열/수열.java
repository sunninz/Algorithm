import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int [] arr = new int[num];

        // 숫자 초기화
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 큰 수 찾기
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<=num-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);

        }
        System.out.println(max);
        bw.flush();
        br.close();
        bw.close();
    }

}
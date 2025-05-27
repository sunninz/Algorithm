import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // 누적합 배열
        int [] arr = new int[num+1];

        for(int i = 1;i <= num;i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        // 최대값 찾기
        int max = Integer.MIN_VALUE;
        for(int i=k;i<=num;i++){
            max = Math.max(max, arr[i]-arr[i-k]);
        }

        System.out.println(max);

        br.close();
    }

}
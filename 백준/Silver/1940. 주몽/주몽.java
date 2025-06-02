import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기화
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int left = 0;
        int right = n-1;
        int count = 0;
        while(left<right){
            if(arr[left] + arr[right] == m){
                count++;
                left++;
                right --;
            }
            else if(arr[left] + arr[right] < m){
                left ++;
            }
            else{
                right --;
            }
        }

        System.out.println(count);
    }
}
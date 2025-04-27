import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int answer = 0;

        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int temp = arr[i] +arr[left] + arr[right];
                if(temp>m){
                    right --;
                }else{
                    if(temp>answer){
                        answer = temp;
                    }
                    left++;
                }
            }
        }
        
        bw.write(answer+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
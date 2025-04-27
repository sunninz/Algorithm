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
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]>answer && arr[i]+arr[j]+arr[k]<=m){
                        answer = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        
        bw.write(answer+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
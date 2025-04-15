import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count=n;

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num==1) {
                count--;
            }
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    count--;
                    break;
                }
            }
        }

        bw.write(count+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
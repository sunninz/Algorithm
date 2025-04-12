import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;

        for(int i=1;i<=p;i++){
            if(p%i==0){
                count++;
                if(count == q){
                    answer = i;
                    break;
                }
            }
        }
        
        bw.write(answer+"");
        
       
        bw.flush();
        bw.close();
        br.close();
    }
}
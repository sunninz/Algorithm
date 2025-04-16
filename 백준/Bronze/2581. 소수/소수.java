import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int min=0;
        int sum=0;
        
        for(int i=n;i<=m;i++){
            boolean flush = true;
            if(i==1) flush = false;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    flush = false;
                    break;
                }
            }
            
            if(flush == true) {
                if(min==0) min=i;
                sum+=i;

            }
            
        }
        if(sum==0){
            bw.write(-1+"");
        }
        else{
            bw.write(sum+"\n"+min);
        }
        
        

        bw.flush();
        bw.close();
        br.close();
    }
}
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int m =0;
        for(int i=1;i<n;i++){
            int sum = 0;
            int number = i;
            while(number!=0){
                sum += number % 10;
                number = number / 10;
            }

            if(sum + i == n){
                m=i;
                break;
            }
        }
        bw.write(m+"");
                
        br.close();
        bw.flush();
        bw.close();
    }
}
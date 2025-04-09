import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 1; //고리번호
        int range = 2; //고리의 시작번호

        if (n==1){
            bw.write(1+"");
        }else{
            while(range <= n){
                range = range + (6*count);
                
                count++;
            }
            bw.write(count+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        int sum_prev = 0; 
        int line =1;
        while(true){
            if(sum_prev + line >= k){
                int line_idx = k - sum_prev;
                if(line%2==0){
                    bw.write(line_idx+"/"+(line+1-line_idx));
                    break;
                }else{
                    bw.write((line+1-line_idx)+"/"+line_idx);
                    break;
                }
            }
            else{
                sum_prev += line;
                line++;
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
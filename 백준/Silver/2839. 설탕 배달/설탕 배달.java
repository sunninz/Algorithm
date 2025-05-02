import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        boolean found = false;
        for(int i = n/5; i >= 0; i--){
            for(int j = n/3; j >= 0; j--){
                if(5*i + 3*j == n){
                    bw.write((i+j)+"");
                    found = true;
                    break;
                }
            }
            if(found) break;
            
        }

        if (!found) {
            bw.write("-1\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }


}

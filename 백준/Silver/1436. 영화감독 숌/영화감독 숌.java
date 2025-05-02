import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 666;


        while(true){
            if(String.valueOf(number).contains("666")){
                count++;
            }
            
            if(count == n ){
                bw.write(number+"");
                break;
            }

            number++;
        }

        br.close();
        bw.flush();
        bw.close();
    }


}

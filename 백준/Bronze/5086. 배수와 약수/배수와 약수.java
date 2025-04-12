import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int secound = Integer.parseInt(st.nextToken());
            if(first>secound){
                if(first%secound==0) bw.write("multiple\n");
                else bw.write("neither\n");
            }
            else if(first<secound){
                if(secound%first==0) bw.write("factor\n");
                else bw.write("neigher\n");
            }

            else{
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
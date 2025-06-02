import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while((input = br.readLine())!= null){

            int num = Integer.parseInt(input);
            int base = 1;
            int len = 1;

            while(base % num != 0){
                base = (base * 10 + 1) % num;
                len++;
            }

            bw.write(len+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
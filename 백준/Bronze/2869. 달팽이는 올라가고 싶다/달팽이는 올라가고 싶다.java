import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int top = Integer.parseInt(st.nextToken());
        int days =(int) Math.ceil((double)(top-down)/(up-down));
        
        bw.write(days+"");
        

        br.close();
        bw.flush();
        bw.close();
    }
}
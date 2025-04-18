import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<Integer> prime;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min_dist=0;

        if(x > w/2 & y > h/2){
            int min_x = w-x;
            int min_y = h-y;
            if(min_x>min_y) min_dist = min_y;
            else min_dist = min_x;
        }
        else if(x<= w/2 & y <= h/2){
            int min_x = x;
            int min_y = y;
            if(min_x>min_y) min_dist = min_y;
            else min_dist = min_x;
        }
        else if(x> w/2 & y<= h/2){
            int min_x = w-x;
            int min_y = y;
            if(min_x>min_y) min_dist = min_y;
            else min_dist = min_x;
        }else{
            int min_x = x;
            int min_y = h-y;
            if(min_x>min_y) min_dist = min_y;
            else min_dist = min_x;
        }

        bw.write(min_dist+"");
        
        

        br.close();
        bw.flush();
        bw.close();
    }


}
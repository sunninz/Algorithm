import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] argss) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int x,y;
        int max_x=Integer.MIN_VALUE, min_x=Integer.MAX_VALUE;
        int max_y=Integer.MIN_VALUE, min_y=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            max_x = Math.max(x,max_x);
            min_x = Math.min(x,min_x);
            max_y = Math.max(y,max_y);
            min_y = Math.min(y,min_y);
        } 
        

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}
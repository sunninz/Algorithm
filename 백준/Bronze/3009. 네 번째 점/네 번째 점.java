import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<Integer> prime;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x_list = new int[3];
        int[] y_list = new int[3];
        int x, y =0;

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_list[i] = Integer.parseInt(st.nextToken());
            y_list[i] = Integer.parseInt(st.nextToken());
        }

        if(x_list[0] == x_list[1]) x = x_list[2];
        else if(x_list[0] == x_list[2]) x = x_list[1];
        else x = x_list[0];

        if(y_list[0] == y_list[1]) y = y_list[2];
        else if(y_list[0] == y_list[2]) y = y_list[1];
        else y = y_list[0];

        bw.write(x+" "+y);


        br.close();
        bw.flush();
        bw.close();
    }


}
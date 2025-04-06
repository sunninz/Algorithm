import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[100][100];
        int count = 0;

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    if(arr[(y+j)][(x+k)]==1) continue;
                    arr[(y+j)][(x+k)] = 1;
                    count+=1;
                }

            }
        }


        bw.write(count+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
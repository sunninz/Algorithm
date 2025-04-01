import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[100][100];

        for(int j=0;j<100;j++){
            for(int k=0;k<100;k++){
                arr[j][k] = 0;
            }

        }
        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    arr[(y-1+j)][(x-1+k)] = 1;
                }

            }
        }

        int sum =0;

        for(int j=0;j<100;j++){
            for(int k=0;k<100;k++){
                sum += arr[j][k];
            }
        }

        bw.write(sum+"");

        br.close();
        bw.flush();
        bw.close();
    }
}